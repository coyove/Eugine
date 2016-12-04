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
import org.coyove.eugine.library.*;
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
    : ('import' | 'reload') (Identifier ('.' Identifier)*)
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
    : Action=(Var | Const) 
        {
            $act = $Action.text.equals("var") ? PSet.MUTABLE : PSet.IMMUTABLE;
        }
    Head=unaryExpr '=' HeadValue=expr
        {
            $multi.add(new PSet(new Atom($Action), $Head.v, $HeadValue.v, $act));
        }
    (',' Tail=unaryExpr '=' TailValue=expr 
        {
            $multi.add(new PSet(new Atom($Action), $Tail.v, $TailValue.v, $act));
        }
    )*
        {
            $v = $multi.size() == 1 ? $multi.head() : new PChain($multi);
        }
    ;

parametersList returns [ 
    ListEx<String> v = new ListEx<String>(),
    ListEx<Boolean> passByValue = new ListEx<Boolean>()
    ]
    :   '(' 
            LastStyle='&'? LastArg=Identifier
            (',' InitStyle='&'? InitArg=Identifier { 
                $v.add($InitArg.text); 
                $passByValue.add($InitStyle == null);
            })*
        ')'

        {
            $v.add(0, $LastArg.text);
            $passByValue.add(0, $LastStyle == null);
        }
    |   '(' ')'
    ;

argumentsList returns [ ListEx<SExpression> v = new ListEx<SExpression>() ]
    :   '(' 
            LastExpr=expr 
            (',' InitExpr=expr { $v.add($InitExpr.v); } )*
        ')'
        {
            $v.add(0, $LastExpr.v);
        }
    |   '(' ')'
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

defineStmt returns [SExpression v]
    locals [ 
        ListEx<SExpression> body = new ListEx<SExpression>(),
        ListEx<SExpression> decorators = new ListEx<SExpression>()
    ]
    :   Def Inline? Coroutine? Struct?
        ('[' Decorator=expr argumentsList? ']' { 
            $decorators.add(new PCall(new Atom($Decorator.start), 
                $Decorator.v, $argumentsList.ctx == null ? null : $argumentsList.v));
        })*
        FunctionName=expr Lambda=lambdaStmt
        {
            Atom a = new Atom($FunctionName.start);
            SExpression closure = $Lambda.v;
            ((PLambda) closure).inline = $Inline != null;
            ((PLambda) closure).coroutine = $Coroutine != null;

            if ($Struct != null) {
                ((PLambda) closure).body.add(new PClone(a, new PVariable("this")));
            }

            for (SExpression d : $decorators) {
                closure = new PCall(a, d, ListEx.build(closure));
            }
            
            $v = new PSet(a, $FunctionName.v, closure, PSet.IMMUTABLE);
        }
    ;

lambdaStmt returns [PLambda v]
    locals [ListEx<SExpression> body = new ListEx<SExpression>(), PVariable ret]
    :   Parameters=parametersList 
        Description=(RawString | StringLiteral)?
        '=>' 
        ('@' Identifier ('(' InitValue=expr ')')? {
            $ret = new PVariable($Identifier.text);
            $body.add(new PSet(new Atom($Identifier), $ret, 
                $InitValue.start == null ? ExecEnvironment.Null : $InitValue.v, PSet.MUTABLE)); 
        })?
        ('{' (stmt { $body.add($stmt.v); })* '}'| stmt { $body.add($stmt.v); })
        {
            if ($ret != null) {
                $body.add($ret);
            }

            $v = new PLambda(new Atom($Parameters.start), $Parameters.v, $Parameters.passByValue,
                $body, $Description == null ? "" : $Description.text, false, false);
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
    : '[' (value { $v.values.add($value.v); }) (',' value { $v.values.add($value.v); } )* ','? ']'
    | '[' ']'
    ;

value returns [SExpression v]
    : expr { $v = $expr.v; }
    | dict { $v = $dict.v; }
    | list { $v = $list.v; }
    ;

topExpr returns [SExpression v]
    : '(' Inner=stmt ')'
        { $v = $Inner.v; }
    | lambdaStmt
        { $v = $lambdaStmt.v; }
    | 'true'
        { $v = ExecEnvironment.True; }
    | 'false'
        { $v = ExecEnvironment.False; }
    | 'null'
        { $v = ExecEnvironment.Null; }
    | Identifier    
        { $v = new PVariable(new Atom($Identifier), $Identifier.text); }
    | RawString     
        { $v = new SConcatString(org.coyove.eugine.util.Utils.unescape($RawString.text)); }
    | StringLiteral 
        { $v = new SConcatString(org.coyove.eugine.util.Utils.unescape($StringLiteral.text)); }
    | Integer
        { $v = new SInt($Integer.text); }
    | Integer ('l' | 'L')
        { $v = new SLong($Integer.text); }
    | Double
        { $v = new SDouble($Double.text); }
    ;

postfixExpr returns [SExpression v]
    : Top=topExpr { $v = $Top.v; }
    | Left=postfixExpr Op=('++' | '--')
        {
            Atom ha = new Atom($Op);
            if ($Op.text.equals("++")) {
                $v = new PSet(ha, $Left.v, new PAdd(ha, $Left.v, new SInt(1)), PSet.SET);
            } else {
                $v = new PSet(ha, $Left.v, new PSubtract(ha, $Left.v, new SInt(1)), PSet.SET);
            }
        }
    | Subject=postfixExpr '[' Key=expr ']'
        {
            $v = new PGet(new Atom($Subject.start), $Subject.v, $Key.v);
        }
    | Subject=postfixExpr '[' Start=expr ('..' | '...') (End=expr)? ']'
        {
            $v = new PSub(new Atom($Subject.start), $Subject.v, $Start.v, $End.ctx == null ? null : $End.v);
        }
    | Subject=postfixExpr '.' Identifier
        {
            $v = new PGet(new Atom($Subject.start), $Subject.v, new SString($Identifier.text));
        }
    | Called=postfixExpr Op=('::' | ':>') Method=Identifier interopArgumentsList 
        {
            $v = new PInteropCall(new Atom($Called.start), $Called.v,
                $Method.text, $interopArgumentsList.defs, $interopArgumentsList.args, 
                $Op.text.equals("::") ? 
                    PInteropCall.RETURN_TYPE.CAST_TO_SVALUE :
                    PInteropCall.RETURN_TYPE.DIRECT_RETURN);
        }
    | Called=postfixExpr Mt='#'? argumentsList
        {
            if ($Mt != null) {
                $v = new PThread(new Atom($Mt), $Called.v, $argumentsList.v);
            } else {
                if (SKeywords.Lookup.containsKey($Called.text)) {
                    $v = SKeywords.Lookup.get($Called.text).call($Called.start, $argumentsList.v); 
                } else {
                    $v = new PCall(new Atom($Called.start), $Called.v, $argumentsList.v);
                }
            }
        }
    ;

unaryExpr returns [SExpression v]
    : Top=postfixExpr { $v = $Top.v; }
    | Sub Right=postfixExpr
        {
            if ($Right.v instanceof SInt) {
                $v = new SInt(-((SInt) $Right.v).val());
            } else if ($Right.v instanceof SLong) {
                $v = new SLong(-((SLong) $Right.v).val());
            } else if ($Right.v instanceof SDouble) {
                $v = new SDouble(-((SDouble) $Right.v).val());
            } else {
                $v = new SEReverse(new Atom($Sub), ListEx.build($Right.v));
            }
        }
    | Not Right=postfixExpr
        {
            $v = new PNot(new Atom($Not), $Right.v);
        }
    | Op=('++' | '--') Left=unaryExpr
        {
            Atom ha = new Atom($Op);
            if ($Op.text.equals("++")) {
                $v = new PSet(ha, $Left.v, new PAdd(ha, $Left.v, new SInt(1)), PSet.SET);
            } else {
                $v = new PSet(ha, $Left.v, new PSubtract(ha, $Left.v, new SInt(1)), PSet.SET);
            }
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
    | Left=addExpr Sub Right=multiplyExpr
        {
            $v = new PSubtract(new Atom($Sub), $Left.v, $Right.v);
        }
    ;

compareExpr returns [SExpression v]
    : Top=addExpr { $v = $Top.v; }
    | Left=compareExpr Op='<' Right=addExpr
        {
            $v = new PLess(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=compareExpr Op='>' Right=addExpr
        {
            $v = new PGreat(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=compareExpr Op='<=' Right=addExpr
        {
            $v = new PLessEqual(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=compareExpr Op='>=' Right=addExpr
        {
            $v = new PGreatEqual(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=compareExpr Op='==' Right=addExpr
        {
            $v = new PEqual(new Atom($Op), $Left.v, $Right.v);
        }
    | Left=compareExpr Op='!=' Right=addExpr
        {
            $v = new PNotEqual(new Atom($Op), $Left.v, $Right.v);
        }
    ;

logicExpr returns [SExpression v]
    : Top=compareExpr { $v = $Top.v; }
    | Left=logicExpr Op='&&' Right=compareExpr
        {
            $v = new PLogic(new Atom($Op), $Left.v, $Right.v, PLogic.AND);
        }
    | Left=logicExpr Op='||' Right=compareExpr
        {
            $v = new PLogic(new Atom($Op), $Left.v, $Right.v, PLogic.OR);
        }
    // | Left=logicExpr ':' JavaFullName
    //     {
    //         $v = new PInteropCast(new Atom($JavaFullName), $Left.v, $JavaFullName.text.replace("/", "."));
    //     }
    ;

assignExpr returns [SExpression v]
    : Top=logicExpr { $v = $Top.v; }
    | Left=unaryExpr Op='+=' Right=assignExpr
        {
            $v = new PSet(new Atom($Op), $Left.v, new PAdd(new Atom($Op), $Left.v, $Right.v), PSet.SET);
        }
    | Left=unaryExpr Op='-=' Right=assignExpr
        {
            $v = new PSet(new Atom($Op), $Left.v, new PSubtract(new Atom($Op), $Left.v, $Right.v), PSet.SET);
        }
    | Left=unaryExpr Op='*=' Right=assignExpr
        {
            $v = new PSet(new Atom($Op), $Left.v, new PMultiply(new Atom($Op), $Left.v, $Right.v), PSet.SET);
        }
    | Left=unaryExpr Op='/=' Right=assignExpr
        {
            $v = new PSet(new Atom($Op), $Left.v, new PDivide(new Atom($Op), $Left.v, $Right.v), PSet.SET);
        }
    | Subject=assignExpr '=' Value=expr
        {
            if ($Subject.v instanceof PGet) {
                PGet get = (PGet) $Subject.v;
                $v = new PPut(new Atom($Subject.start), get.sub, get.key, $Value.v, PPut.DECLARE.SET);
            } else {
                $v = new PSet(new Atom($Subject.start), $Subject.v, $Value.v, PSet.SET);
            }
        }
    ;

expr returns [SExpression v]
    : assignExpr { $v = $assignExpr.v; }
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
    | Yield (Yielded=expr | '(' ')')
        { 
            $v = new PYield(new Atom($Yield), $Yielded.start != null ? $Yielded.v : ExecEnvironment.Null); 
        }
    | Type Subject=expr
        { 
            $v = new PType(new Atom($Type), $Subject.v, PType.TYPE.TYPE); 
        }
    | For Subject=expr Do Body=expr
        {
            $v = new PFor(new Atom($For), $Subject.v, $Body.v, $For.text.equals("for") ? PFor.ASC : PFor.DESC); 
        }
    | For Start=expr (',' Next=expr)? ('..' | '...') End=expr Do Body=expr
        {
            Atom atom = new Atom($For);
            PIRange r = new PIRange(atom, ListEx.build(
                    $Start.v, 
                    $Next.ctx == null ? new SInt(1) : new PSubtract(atom, $Next.v, $Start.v), 
                    $End.v
                ));

            $v = new PFor(atom, r, $Body.v, PFor.ASC); 
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