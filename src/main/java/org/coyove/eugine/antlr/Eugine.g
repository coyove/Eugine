grammar Eugine;
import commons;

@header
{
package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
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
    | EOF       { $v = new SNull(); }
;

code returns [SExpression v]
    : ('{' B1=block '}' | B2=stmt)
    {
        $v = $B1.ctx == null ? $B2.v : $B1.v;
    }
    ;

block returns [SExpression v]
    @init { $v = new PChain(); }
    : (stmt { ((PChain) $v).expressions.add($stmt.v); })+
;

stmt returns [SExpression v]
    : importStmt        { $v = new SNull(); }
    | enterStmt         { $v = $enterStmt.v; }
    | syncStmt          { $v = $syncStmt.v; }
    | declareStmt       { $v = $declareStmt.v; }
    | defineStmt        { $v = $defineStmt.v; }
    | expr              { $v = $expr.v; }
    | Semi              { $v = new SNull(); }
    ;

importStmt 
    : 'import' (Identifier ('.' Identifier)*)
    ;

enterStmt returns [SExpression v]
    : Enter Body=code (Catch '(' Identifier ')' CatchBody=code)? (Do DoBody=code)?
        {
            $v = new PEnter(new Atom($Enter), $Body.v, 
                $Catch == null ? null : $CatchBody.v, $Do == null ? null : $DoBody.v, $Identifier.text);
        }
    ;

syncStmt returns [SExpression v]
    : Sync Body=code { $v = new PSync(new Atom($Sync), $Body.v); }
    ;

declareStmt returns [SExpression v]
    : Action=(Var | Const) Identifier ('=' Value=expr)?
        {
            $v = new PSet(new Atom($Identifier), new SString($Identifier.text), 
                $Value.start == null ? new SNull() : $Value.v, 
                PSet.DECLARE.DECLARE, 
                $Action.text.equals("var") ? PSet.ACTION.MUTABLE : PSet.ACTION.IMMUTABLE);
        }
    | Action=(Var | Const) Subject=expr ('=' Value=expr)?
        {
            $v = new PSet(new Atom($Subject.start), $Subject.v, 
                $Value.start == null ? new SNull() : $Value.v, 
                PSet.DECLARE.SET, 
                $Action.text.equals("var") ? PSet.ACTION.MUTABLE : PSet.ACTION.IMMUTABLE);
        }
    ;

definitionsList returns [ 
    org.coyove.eugine.util.List<String> v = new org.coyove.eugine.util.List<String>(),
    org.coyove.eugine.util.List<Boolean> passByValue = new org.coyove.eugine.util.List<Boolean>()
    ]
    : '(' (InitStyle='&'? InitArg=Identifier ',' { 
        $v.add($InitArg.text); 
        $passByValue.add($InitStyle == null);
    } )* LastStyle='&'? LastArg=Identifier ')' 
    {
        $v.add($LastArg.text);
        $passByValue.add($LastStyle == null);
    }
    | '(' ')'
    ;

argumentsList returns [ org.coyove.eugine.util.List<SExpression> v = 
        new org.coyove.eugine.util.List<SExpression>() ]
    : '(' (InitExpr=expr ',' { $v.add($InitExpr.v); } )* LastExpr=expr ')'
    {
        $v.add($LastExpr.v);
    }
    | '(' ')'
    ;

interopArgumentsList returns [ 
        org.coyove.eugine.util.List<SExpression> args = new org.coyove.eugine.util.List<SExpression>(),
        org.coyove.eugine.util.List<String> defs = new org.coyove.eugine.util.List<String>() ]
    : '(' 
        (InitExpr=expr ':' InitDef=(JavaFullName | Identifier) ',' 
            { 
                $args.add($InitExpr.v);
                $defs.add($InitDef.text.replace("\\", "."));
            } )* 
        LastExpr=expr ':' LastDef=(JavaFullName | Identifier)
    ')'
    {
        $args.add($LastExpr.v);
        $defs.add($LastDef.text.replace("\\", "."));
    }
    | '(' ')'
    ;

defineStmt returns [SExpression v]
    locals [ 
        org.coyove.eugine.util.List<SExpression> body = new org.coyove.eugine.util.List<SExpression>(),
        org.coyove.eugine.util.List<SExpression> decorators = new org.coyove.eugine.util.List<SExpression>()
    ]
    : Def
        ('[' Decorator=expr argumentsList? ']' { 
            $decorators.add(new PCall($Decorator.v, $argumentsList.ctx == null ? null : $argumentsList.v, 
                new Atom($Decorator.start), null));
        })*
        (Identifier | Get=expr) 
        Definition=definitionsList 
        Description=(RawString | StringLiteral)? 
        '=>'
        ('{' (stmt { $body.add($stmt.v); })* '}' | stmt { $body.add($stmt.v); }) 
        {
            Atom a = $Identifier != null ? new Atom($Identifier) : new Atom($Get.start);
            SExpression sub = $Identifier != null ? new SString($Identifier.text) : $Get.v;
            SExpression lambda = new PLambda(a, $Definition.v, $Definition.passByValue, 
                $body, $Description == null ? "" : $Description.text);

            if ($Identifier != null || $Get.v instanceof PGet) {
                for (SExpression d : $decorators) {
                    lambda = new PCall(d, org.coyove.eugine.util.List.build(lambda), a, null);
                }
                
                $v = new PSet(a, sub, lambda, PSet.DECLARE.DECLARE, PSet.ACTION.IMMUTABLE);
            } else {
                // error
                $v = new SNull();
            }
        }
    ;

lambdaStmt returns [SExpression v]
    locals [ org.coyove.eugine.util.List<SExpression> body = new org.coyove.eugine.util.List<SExpression>(); ]
    : definitionsList '=>' ('{' (stmt { $body.add($stmt.v); })* '}'| stmt { $body.add($stmt.v); })
    {
        $v = new PLambda(new Atom($definitionsList.start), $definitionsList.v, $definitionsList.passByValue,
            $body, "anonymous");
    }
    ;

callStmt returns [SExpression v]
    : Identifier argumentsList {
        String func = $Identifier.text;
        if (SKeywords.Lookup.containsKey(func)) {
            $v = SKeywords.Lookup.get(func).call($Identifier, $argumentsList.v); 
        } else {
            $v = new PCall(new PVariable($Identifier.text), $argumentsList.v, new Atom($Identifier), null);
        }
    }
    ;

switchStmt returns [SExpression v]
    locals [ 
        org.coyove.eugine.util.List<Branch> branches = new org.coyove.eugine.util.List<Branch>(),
        Branch db = null
    ]
    : Switch Condition=expr Do '{' (Tester=expr '=>' Code=code {
        Branch b = new Branch();
        b.recv = $Tester.v;
        b.body = new org.coyove.eugine.util.List<SExpression>();
        b.body.add($Code.v);

        if ($Tester.text.equals("_")) {
            $db = b;
        } else {
            $branches.add(b);
        }
    })* '}'
        {
            $v = new PCond(new Atom($Switch), $Condition.v, $branches, $db);
        }
    ;

dict returns [SExpression v]
    locals [ HashMap<String, SExpression> ret = new HashMap<String, SExpression>(); ]
    : '{' pair { $ret.put($pair.k, $pair.v); } (',' pair { $ret.put($pair.k, $pair.v); } )* ','? '}'
        { $v = new SDict($ret); }
    | '{' '}'
        { $v = new SDict($ret); }
    ;

pair returns [String k, SExpression v]
    : Key=(StringLiteral | RawString) ':' Value=value
        { $k = org.coyove.eugine.util.Utils.unescape($Key.text); $v = $Value.v; }
    | Key=Identifier ':' Value=value
        { $k = $Key.text; $v = $Value.v; }
    ;

list returns [SExpression v]
    locals [ org.coyove.eugine.util.List<SExpression> ret = new org.coyove.eugine.util.List<SExpression>(); ]
    : '[' (value { $ret.add($value.v); }) (',' value { $ret.add($value.v); } )* ']'
        { $v = new SList($ret); }
    | '[' ']'
        { $v = new SList($ret); }
    ;

value returns [SExpression v]
    : expr { $v = $expr.v; }
    | dict { $v = $dict.v; }
    | list { $v = $list.v; }
    ;

topExpr returns [SExpression v]
    : '(' Inner=stmt ')'
        { $v = $Inner.v; }
    | Called=topExpr Op=('::' | ':>') Method=Identifier interopArgumentsList 
        {
            $v = new PInteropCall(new Atom($Called.start), $Called.v,
                $Method.text, $interopArgumentsList.defs, $interopArgumentsList.args, 
                $Op.text.equals("::") ? 
                    PInteropCall.RETURN_TYPE.CAST_TO_SVALUE :
                    PInteropCall.RETURN_TYPE.DIRECT_RETURN);
        }
    | Called=topExpr Mt='#'? argumentsList
        {
            if ($Mt != null) {
                $v = new PThread(new Atom($Mt), $Called.v, $argumentsList.v);
            } else {
                if (SKeywords.Lookup.containsKey($Called.text)) {
                    $v = SKeywords.Lookup.get($Called.text).call($Called.start, $argumentsList.v); 
                } else {
                    $v = new PCall($Called.v, $argumentsList.v, new Atom($Called.start), null);
                }
            }
        }
    | lambdaStmt
        { $v = $lambdaStmt.v; }
    | Subject=topExpr '[' Key=expr ']'
        {
            $v = new PGet(new Atom($Subject.start), $Subject.v, $Key.v);
        }
    | Subject=topExpr '[' Start=expr ('..' | '...') (End=expr)? ']'
        {
            $v = new PSub(new Atom($Subject.start), $Subject.v, $Start.v, $End.ctx == null ? null : $End.v);
        }
    | Subject=topExpr '.' Identifier
        {
            $v = new PGet(new Atom($Subject.start), $Subject.v, new SString($Identifier.text));
        }
    | Identifier    
        { $v = new PVariable($Identifier.text); }
    | RawString     
        { $v = new SString(org.coyove.eugine.util.Utils.unescape($RawString.text)); }
    | StringLiteral 
        { $v = new SString(org.coyove.eugine.util.Utils.unescape($StringLiteral.text)); }
    | Integer
        { $v = new SInteger($Integer.text); }
    | Double
        { $v = new SDouble($Double.text); }
    ;

unaryExpr returns [SExpression v]
    : Top=topExpr { $v = $Top.v; }
    | Sub Right=topExpr
        {
            if ($Right.v instanceof SInteger) {
                $v = new SInteger(-((SInteger) $Right.v).<Long>get());
            } else if ($Right.v instanceof SDouble) {
                $v = new SDouble(-((SDouble) $Right.v).<Double>get());
            } else {
                $v = new SEReverse(new Atom($Sub), org.coyove.eugine.util.List.build($Right.v)); 
            }
        }
    | Not Right=topExpr
        {
            $v = SKeywords.Lookup.get($Not.text).call($Not, org.coyove.eugine.util.List.build($Right.v));
        }
    | Left=unaryExpr Op=('++' | '--')
        {
            Atom ha = new Atom($Op);
            if ($Op.text.equals("++")) {
                $v = new PSet(ha, $Left.v, 
                    new PAdd(ha, org.coyove.eugine.util.List.build($Left.v, new SInteger(1)), false),
                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
            } else {
                $v = new PSet(ha, $Left.v, 
                    new PMath(ha, 
                        org.coyove.eugine.util.List.build($Left.v, new SInteger(1)), PMath.ACTION.SUBTRACT),
                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
            }
        }
    ;

multiplyExpr returns [SExpression v]
    : Top=unaryExpr { $v = $Top.v; }
    | Left=multiplyExpr Op=('*'|'/'|'%') Right=unaryExpr
        {
            $v = SKeywords.Lookup.get($Op.text).call($Op, 
                org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    ;

addExpr returns [SExpression v]
    : Top=multiplyExpr { $v = $Top.v; }
    | Left=addExpr AddOp=('+'|'+>') Right=multiplyExpr
        {
            $v = new PAdd(new Atom($AddOp), 
                org.coyove.eugine.util.List.build($Left.v, $Right.v), $AddOp.text.equals("+>"));
        }
    | Left=addExpr Sub Right=multiplyExpr
        {
            $v = new PMath(new Atom($Sub), 
                org.coyove.eugine.util.List.build($Left.v, $Right.v), PMath.ACTION.SUBTRACT);
        }
    ;

compareExpr returns [SExpression v]
    : Top=addExpr { $v = $Top.v; }
    | Left=compareExpr Op=('<'|'>'|'<='|'>='|'=='|'!=') Right=addExpr
        {
            $v = SKeywords.Lookup.get($Op.text).call($Op, 
                org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    ;

logicExpr returns [SExpression v]
    : Top=compareExpr { $v = $Top.v; }
    | Left=logicExpr Op=('&&'|'||') Right=compareExpr
        {
            $v = SKeywords.Lookup.get($Op.text).call($Op, 
                org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    | Left=logicExpr ':' JavaFullName
        {
            $v = new PInteropCast(new Atom($JavaFullName), $Left.v, $JavaFullName.text);
        }
    ;

assignExpr returns [SExpression v]
    :   Top=logicExpr { $v = $Top.v; }
    |   Left=unaryExpr Op=('+=' | '-=' | '*=' | '/=') Right=assignExpr
        {
            Atom ha = new Atom($Op);
            if ($Op.text.equals("+=")) {
                $v = new PSet(ha, $Left.v, 
                    new PAdd(ha, org.coyove.eugine.util.List.build($Left.v, $Right.v), false),
                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
            } else {
                String text = $Op.text.substring(0, 1);
                $v = new PSet(ha, $Left.v, 
                    SKeywords.Lookup.get(text).call($Op, 
                        org.coyove.eugine.util.List.build($Left.v, $Right.v)),
                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
            }
        }
    | Identifier '=' Value=expr
        {
            $v = new PSet(new Atom($Identifier),
                new SString($Identifier.text), $Value.v, PSet.DECLARE.SET, PSet.ACTION.MUTABLE); 
        }
    | Subject=assignExpr '=' Value=expr
        {
            $v = new PSet(new Atom($Subject.start), $Subject.v, $Value.v, PSet.DECLARE.SET, PSet.ACTION.MUTABLE);    
        }
    ;

expr returns [SExpression v]
    : assignExpr { $v = $assignExpr.v; }
    | New JavaFullName interopArgumentsList
        {
            String classname = $JavaFullName.text.replace("\\", ".");
            $v = new PInteropNew(new Atom($New), getClassByName(classname, $New),
                $interopArgumentsList.defs, $interopArgumentsList.args);
        }
    | Static JavaFullName
        { $v = getClassByName($JavaFullName.text.replace("\\", "."), $Static); }
    | Clone Subject=expr
        { $v = new PClone(new Atom($Clone), $Subject.v); }
    | Type Subject=expr
        { $v = new PType(new Atom($Type), $Subject.v, PType.TYPE.TYPE); }
    | AddressOf Subject=expr
        { $v = new PType(new Atom($AddressOf), $Subject.v, PType.TYPE.ADDR); }
    | For Subject=expr Do Body=expr
        { 
            $v = new PFor(new Atom($For), $Subject.v, $Body.v, 
                $For.text.equals("for") ? PFor.DIRECTION.ASC : PFor.DIRECTION.DESC); 
        }
    | For Start=expr (',' Next=expr)? ('..' | '...') End=expr Do Body=expr
        { 
            PIRange r = new PIRange(new Atom($For), org.coyove.eugine.util.List.build(
                    $Start.v, 
                    $Next.ctx == null ? 
                        new SInteger(1) : 
                        new PMath(new Atom($Next.start), 
                            org.coyove.eugine.util.List.build($Next.v, $Start.v),
                            PMath.ACTION.SUBTRACT), 
                    $End.v
                ));
            $v = new PFor(new Atom($For), r, $Body.v, PFor.DIRECTION.ASC); 
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