grammar Eugine;
import commons;

@header
{
package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.interop.*;
import org.coyove.eugine.core.math.*;
import org.coyove.eugine.core.flow.*;
import org.coyove.eugine.builtin.*;
import org.coyove.eugine.parser.Atom;
import java.util.HashMap;
import org.apache.commons.lang3.ClassUtils;
}

@parser::members {
    public static SObject getClassByName(String classname, Token tok) {
        try {
            return new SObject(ClassUtils.getClass(classname));
        } catch(Exception e) {
            ErrorHandler.print(4056, "cannot initiate " + classname, new Atom(tok));
            return null;
        }
    }

    public static SExpression identifySetter(Atom atom, SExpression subject, SExpression value, byte action) {
        if (subject instanceof PGet) {
            PGet get = (PGet) subject;
            return new PPut(atom, get.subject, get.key, value, action == PSet.SET ? PPut.SET : PPut.VAR);
        } else {
            return new PSet(atom, subject, value, action);
        }
    }
}

prog returns [SExpression v]
    : (block { $v = $block.v; } )+
    | EOF    { $v = ExecEnvironment.Null; }
;

code returns [SExpression v]
    : ('{' B1=block '}' | B2=stmt)
    {
        $v = $B1.ctx == null ? $B2.v : $B1.v;
    }
    | '{' '}'
        {
            $v = ExecEnvironment.Null;
        }
    ;

block returns [PChain v = new PChain()]
    : (stmt { $v.expressions.add($stmt.v); })+
;

stmt returns [SExpression v]
    : importStmt        { $v = ExecEnvironment.Null; }
    | enterStmt         { $v = $enterStmt.v; }
    | declareStmt       { $v = $declareStmt.v; }
    | defineStmt        { $v = $defineStmt.v; }
    | expr              { $v = $expr.v; }
    | Semi              { $v = ExecEnvironment.Null; }
    ;

importStmt 
    : ('import' | 'reload' | 'include') (Identifier ('.' Identifier)*)
    ;

enterStmt returns [SExpression v]
    : Enter Body=code (Catch '(' Identifier ')' CatchBody=code)? (Do DoBody=code)?
        {
            $v = new PEnter(new Atom($Enter), $Body.v, 
                $Catch == null ? null : $CatchBody.v, 
                $Do == null ? null : $DoBody.v, $Identifier.text);
        }
    ;

syncStmt returns [SExpression v]
    : Sync Body=code { $v = new PSync(new Atom($Sync), $Body.v); }
    ;

declareStmt returns [SExpression v]
    locals [ ListEx<SExpression> multi = new ListEx<SExpression>(), byte act ]
    :   Action=(Var | Let) 
        {
            $act = $Action.text.equals("var") ? PSet.VAR : PSet.LET;
        }
        Head=unaryExpr '=' HeadValue=expr
        {
            $multi.add(identifySetter(new Atom($Action), $Head.v, $HeadValue.v, $act));
        }
        (',' Tail=unaryExpr '=' TailValue=expr {
            $multi.add(identifySetter(new Atom($Action), $Tail.v, $TailValue.v, $act));
        })*
        {
            $v = $multi.size() == 1 ? $multi.head() : new PChain($multi);
        }
    ;

parametersList returns [ 
    ListEx<String> v = new ListEx<String>(),
    ListEx<Boolean> passByValue = new ListEx<Boolean>()
    ]
    :   LastStyle='&'? LastArg=Identifier
        (',' InitStyle='&'? InitArg=Identifier { 
            $v.add($InitArg.text); 
            $passByValue.add($InitStyle == null);
        })*
        {
            $v.add(0, $LastArg.text);
            $passByValue.add(0, $LastStyle == null);
        }
    ;

argumentsList returns [ ListEx<SExpression> v = new ListEx<SExpression>() ]
    :   HeadExpr=expr { $v.add($HeadExpr.v); } (',' TailExpr=expr { $v.add($TailExpr.v); } )*
    ;

interopArgumentDeclaration returns [SExpression v, String c]
    :   InitExpr=expr (':' InitDef=(JavaFullName | Identifier))?
        {
            $v = $InitExpr.v;
            $c = $InitDef.text == null ? "" : $InitDef.text.replace("/", ".");
        } 
    ;

interopArgumentsList returns [ 
        ListEx<SExpression> args = new ListEx<SExpression>(),
        ListEx<String> defs = new ListEx<String>() ]
    : '(' 
        (InitExpr=interopArgumentDeclaration ',' { $args.add($InitExpr.v); $defs.add($InitExpr.c); })* 
        LastExpr=interopArgumentDeclaration
    ')'
        {
            $args.add($LastExpr.v);
            $defs.add($LastExpr.c);
        }
    | '(' ')'
    ;

defineStmt 
    returns [SExpression v]
    locals  [ListEx<SExpression> decorators = new ListEx<SExpression>()]
    :   Def (Struct | Operator | Get='getter' | Set='setter')?
        ('[' Decorator=expr ('(' argumentsList? ')')? ']' { 
            $decorators.add(new PCall(new Atom($Decorator.start), 
                $Decorator.v, $argumentsList.ctx == null ? null : $argumentsList.v));
        })*
        (FunctionSubject=Identifier '.')? FunctionName=Identifier
        Lambda=lambdaStmt
        {
            Atom a = new Atom($FunctionName);
            SExpression closure = $Lambda.v;
            SExpression name = new PVariable($FunctionName.text);

            if ($Struct != null) {
                ((PLambda) closure).struct = true;
                $v = new PSet(a, name, closure, PSet.VAR);
            } else if ($Operator != null) {
                ((PLambda) closure).operator = true;
                $v = new PPut(a, new PVariable($FunctionSubject.text), 
                    new SString("__" + $FunctionName.text + "__"), closure, PPut.VAR);
            } else {
                // getters and setters can have decorators
                for (SExpression d : $decorators) {
                    closure = new PCall(a, d, ListEx.build(closure));
                }

                if ($Get != null) {
                    $v = new PPut(a, new PVariable($FunctionSubject.text), 
                        new SString("__get__" + $FunctionName.text), closure, PPut.VAR);
                } else if ($Set != null) {
                    $v = new PPut(a, new PVariable($FunctionSubject.text), 
                        new SString("__set__" + $FunctionName.text), closure, PPut.VAR);
                } else if ($FunctionSubject != null) {
                    $v = new PPut(a, new PVariable($FunctionSubject.text),
                        new SString($FunctionName.text), closure, PPut.VAR);
                } else {
                    $v = new PSet(a, name, closure, PSet.VAR);
                }
            }
        }
    ;

lambdaStmt returns [PLambda v]
    locals [ListEx<SExpression> body = new ListEx<SExpression>(), PVariable ret]
    :   LambdaStart='(' Parameters=parametersList? ')'
        Description=(RawString | StringLiteral)?
        '=>' 
        ('@' Identifier ('(' InitValue=expr ')')? {
            $ret = new PVariable($Identifier.text);
            $body.add(new PSet(new Atom($Identifier), $ret, 
                $InitValue.start == null ? ExecEnvironment.Null : $InitValue.v, PSet.VAR)); 
        })?
        ('{' (stmt { $body.add($stmt.v); })* '}'| stmt { $body.add($stmt.v); })
        {
            if ($ret != null) {
                $body.add($ret);
            }

            ListEx<String> v = $Parameters.ctx == null ? new ListEx<String>() : $Parameters.v;
            ListEx<Boolean> pbv = $Parameters.ctx == null ? new ListEx<Boolean>() : $Parameters.passByValue;

            $v = new PLambda(new Atom($LambdaStart), v, pbv, $body, $Description == null ? "" : $Description.text);
        }
    ;

switchStmt returns [SExpression v]
    locals [ 
        ListEx<Branch> branches = new ListEx<Branch>(),
        Branch db = null
    ]
    :   Switch Condition=expr Do '{' (Tester=expr '=>' Code=code {
            Branch b = new Branch();
            b.recv = $Tester.v;
            b.body = new ListEx<SExpression>();
            b.body.add($Code.v);

            if ($Tester.text.equals("_")) {
                $db = b;
            } else {
                $branches.add(b);
            }
        })* '}'
        {
            $v = new PSwitch(new Atom($Switch), $Condition.v, $branches, $db);
        }
    ;

dict returns [PDict v = new PDict()]
    : '{' 
        pair { $v.keys.add($pair.k); $v.values.add($pair.v); }
        (',' pair { $v.keys.add($pair.k); $v.values.add($pair.v); } )* ','? 
        '}'
    | '{' '}'
    ;

pair returns [String k, SExpression v]
    : Key=(StringLiteral | RawString) ':' Value=value
        { $k = org.coyove.eugine.util.Utils.unescape($Key.text); $v = $Value.v; }
    | Key=Identifier ':' Value=value
        { $k = $Key.text; $v = $Value.v; }
    ;

list returns [PList v = new PList()]
    :   '[' 
            (value { $v.values.add($value.v); }) 
            (',' value { $v.values.add($value.v); } )* 
        ','? 
        ']'
    |   '[' ']'
    ;

value returns [SExpression v]
    : expr { $v = $expr.v; }
    | dict { $v = $dict.v; }
    | list { $v = $list.v; }
    ;

topExpr returns [SExpression v]
    :   '(' Inner=stmt ')'
        { $v = $Inner.v; }
    |   lambdaStmt
        { $v = $lambdaStmt.v; }
    |   'true'
        { $v = ExecEnvironment.True; }
    |   'false'
        { $v = ExecEnvironment.False; }
    |   'null'
        { $v = ExecEnvironment.Null; }
    |   'break'
        { $v = ExecEnvironment.Break; }
    |   Identifier    
        { $v = new PVariable(new Atom($Identifier), $Identifier.text); }
    |   RawString     
        { $v = new SConcatString(org.coyove.eugine.util.Utils.unescape($RawString.text)); }
    |   StringLiteral 
        { $v = new SConcatString(org.coyove.eugine.util.Utils.unescape($StringLiteral.text)); }
    |   Integer
        { $v = new SNumber($Integer.text); }
    |   Double
        { $v = new SNumber($Double.text); }
    ;

postfixExpr returns [SExpression v]
    :   Top=topExpr { $v = $Top.v; }
    |   Left=postfixExpr Op='++' 
        {
            $v = new PAssign(new Atom($Op), $Left.v, new SNumber(1), "+=");
        }
    |   Left=postfixExpr Op='--' 
        {
            $v = new PAssign(new Atom($Op), $Left.v, new SNumber(1), "-=");
        }
    |   Subject=postfixExpr '[' Key=assignExpr ']'
        {
            $v = new PGet(new Atom($Subject.start), $Subject.v, $Key.v);
        }
    |   Subject=postfixExpr '[' Start=assignExpr ('..' | '...') (End=assignExpr)? ']'
        {
            $v = new PSub(new Atom($Subject.start), $Subject.v, $Start.v, $End.ctx == null ? null : $End.v);
        }
    |   Subject=postfixExpr '.' Identifier
        {
            $v = new PGet(new Atom($Identifier), $Subject.v, new SString($Identifier.text));
        }
    |   Called=postfixExpr Op=('::' | ':>') Method=Identifier Ial=interopArgumentsList 
        {
            $v = new PInteropCall(new Atom($Called.start), $Called.v, $Method.text, $Ial.defs, $Ial.args, 
                $Op.text.equals("::") ? 
                    PInteropCall.RETURN_TYPE.CAST_TO_SVALUE :
                    PInteropCall.RETURN_TYPE.DIRECT_RETURN);
        }
    |   Called=postfixExpr '(' argumentsList? ')'
        {
            ListEx<SExpression> arguments = $argumentsList.ctx == null ? 
                new ListEx<SExpression>() : $argumentsList.v;
            if (SKeywords.Lookup.containsKey($Called.text)) {
                $v = SKeywords.Lookup.get($Called.text).call($Called.start, arguments); 
            } else {
                $v = new PCall(new Atom($Called.start), $Called.v, arguments);
            }
        }
    ;

unaryExpr returns [SExpression v]
    :   Top=postfixExpr { $v = $Top.v; }
    |   Sub='-' Right=postfixExpr
        {
            if ($Right.v instanceof SNumber) {
                $v = new SNumber(-((SNumber) $Right.v).doubleValue());
            } else {
                $v = new SEReverse(new Atom($Sub), ListEx.build($Right.v));
            }
        }
    |   Not='!' Right=postfixExpr
        {
            $v = new PNot(new Atom($Not), $Right.v);
        }
    |   BitNot='~' Right=postfixExpr
        {
            $v = new PBitNot(new Atom($BitNot), $Right.v);
        }
    ;

multiplyExpr returns [SExpression v]
    : Top=unaryExpr { $v = $Top.v; }
    | Left=multiplyExpr Op='*' Right=unaryExpr
        {
            $v = new PMultiply(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=multiplyExpr Op='/' Right=unaryExpr
        {
            $v = new PDivide(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=multiplyExpr Op='%' Right=unaryExpr
        {
            $v = new PModular(new Atom($Op), $Left.v, $Right.v);
        }
    ;

addExpr returns [SExpression v]
    : Top=multiplyExpr { $v = $Top.v; }
    | Left=addExpr AddOp='+' Right=multiplyExpr
        {
            $v = new PAdd(new Atom($AddOp), $Left.v, $Right.v);
        }
    | Left=addExpr AddOp='<+' Right=multiplyExpr
        {
            $v = new PAppend(new Atom($AddOp), $Left.v, $Right.v);
        }
    | Left=addExpr Sub='-' Right=multiplyExpr
        {
            $v = new PSubtract(new Atom($Sub), $Left.v, $Right.v);
        }
    ;

compareExpr returns [SExpression v]
    : Top=addExpr { $v = $Top.v; }
    | Left=compareExpr Op=('<' | '<=' | '==' | '!=' | '>=' | '>') Right=addExpr
        {
            $v = PIntrinsicCompare.get(new Atom($Op), $Left.v, $Op.text, $Right.v);
        }
    ;

bitExpr returns [SExpression v]
    :   Top=compareExpr { $v = $Top.v; }
    |   Left=bitExpr Op='|' Right=compareExpr
        {
            $v = new PBitOr(new Atom($Op), $Left.v, $Right.v);
        }
    |   Left=bitExpr Op='&' Right=compareExpr
        {
            $v = new PBitAnd(new Atom($Op), $Left.v, $Right.v);
        }
    |   Left=bitExpr Op='^' Right=compareExpr
        {
            $v = new PBitXor(new Atom($Op), $Left.v, $Right.v);
        }
    ;

logicExpr returns [SExpression v]
    : Top=bitExpr { $v = $Top.v; }
    | Left=logicExpr Op=('&&' | '||') Right=bitExpr
        {
            $v = new PLogic(new Atom($Op), $Left.v, $Right.v, $Op.text.equals("||") ? PLogic.OR : PLogic.AND);
        }
    ;

assignExpr returns [SExpression v]
    : Top=logicExpr { $v = $Top.v; }
    | Identifier Op=AssignOp Right=assignExpr
        {
            $v = new PAssign(new Atom($Op), new PVariable($Identifier.text), $Right.v, $Op.text);
        }
    | Subject1=postfixExpr '.' Identifier Op=AssignOp Right=assignExpr
        {
            $v = new PAssign(new Atom($Op), $Subject1.v, new SString($Identifier.text), $Right.v, $Op.text);
        }
    | Subject2=postfixExpr '[' Key=assignExpr ']' Op=AssignOp Right=assignExpr
        {
            $v = new PAssign(new Atom($Op), $Subject2.v, $Key.v, $Right.v, $Op.text);
        }
    | Subject3=assignExpr '=' Value=expr
        {
            $v = identifySetter(new Atom($Subject3.start), $Subject3.v, $Value.v, PSet.SET);
        }
    ;

expr returns [SExpression v]
    : assignExpr { $v = $assignExpr.v; }
    | '@' MetaExpression=expr
        {
            $v = new PMeta(new Atom($MetaExpression.start), $MetaExpression.v);
        }
    | New JavaFullName interopArgumentsList
        {
            String classname = $JavaFullName.text.replace("/", ".");
            $v = new PInteropNew(new Atom($New), getClassByName(classname, $New),
                $interopArgumentsList.defs, $interopArgumentsList.args);
        }
    | Static JavaFullName
        { 
            $v = getClassByName($JavaFullName.text.replace("/", "."), $Static); 
        }
    | Clone Subject=expr
        { 
            $v = new PClone(new Atom($Clone), $Subject.v); 
        }
    | Sync SyncBody=code 
        { 
            $v = new PSync(new Atom($Sync), $SyncBody.v); 
        }
    | For Subject=expr Do Body=expr
        {
            $v = new PFor(new Atom($For), $Subject.v, $Body.v); 
        }
    | For Start=expr (',' Next=expr)? ('..' | '...') End=expr Do Body=expr
        {
            Atom atom = new Atom($For);
            PIRange r = new PIRange(atom, ListEx.build(
                    $Start.v, 
                    $Next.ctx == null ? new SNumber(1) : new PSubtract(atom, $Next.v, $Start.v), 
                    $End.v
                ));

            $v = new PFor(atom, r, $Body.v); 
        }
    | If Condition=expr True=code (Else False=code)?
        {
            $v = new PIf(new Atom($If), $Condition.v, $True.v, $False.start == null ? null : $False.v);
        }
    | switchStmt
        { $v = $switchStmt.v; }
    | list
        { $v = $list.v; }
    | dict
        { $v = $dict.v; }
    ;