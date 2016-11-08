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
    @init { $v = new SEChain(); }
    : (stmt { ((SEChain) $v).expressions.add($stmt.v); })+
;

stmt returns [SExpression v]
    : importStmt        { $v = new SNull(); }
    | enterStmt         { $v = $enterStmt.v; }
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
            $v = new SETry(new Atom($Enter), $Body.v, 
                $Catch == null ? null : $CatchBody.v, $Do == null ? null : $DoBody.v, $Identifier.text);
        }
    ;

declareStmt returns [SExpression v]
    : Var Identifier ('=' Value=expr)?
        {
            $v = new SESet(new Atom($Identifier), new SString($Identifier.text), 
                $Value.start == null ? new SNull() : $Value.v, 
                SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
        }
    | Var Subject=expr ('=' Value=expr)?
        {
            $v = new SESet(new Atom($Subject.start), $Subject.v, 
                $Value.start == null ? new SNull() : $Value.v, 
                SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
        }
    | Identifier '=' Value=expr
        {
            $v = new SESet(new Atom($Identifier),
                new SString($Identifier.text), $Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
        }
    | Subject=expr '=' Value=expr
        {
            $v = new SESet(new Atom($Subject.start), $Subject.v, $Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
        }
    ;

definitionsList returns [ org.coyove.eugine.util.List<String> v = new org.coyove.eugine.util.List<String>(); ]
    : '(' (InitArg=Identifier ',' { $v.add($InitArg.text); } )* LastArg=Identifier ')' 
    {
        $v.add($LastArg.text);
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
        SExpression decorators = null
    ]
    : Def
        (Decorator=expr argumentsList? { 
            org.coyove.eugine.util.List<SExpression> args = $argumentsList.ctx == null ? null : $argumentsList.v;
            if ($decorators == null) {
                $decorators = new SECall($Decorator.v, args, new Atom($Decorator.start), null);
            } else {
                $decorators = new SECall(
                    new SECall($Decorator.v, args, new Atom($Decorator.start), null), args,
                    new Atom($Decorator.start), null);
            }
        })*
        (Identifier | Get=expr) 
        Definition=definitionsList 
        Description=(RawString | StringLiteral)? 
        '='
        ('{' (stmt { $body.add($stmt.v); })* '}' | stmt { $body.add($stmt.v); }) 
        {
            Atom a = $Identifier != null ? new Atom($Identifier) : new Atom($Get.start);
            SExpression sub = $Identifier != null ? new SString($Identifier.text) : $Get.v;
            String desc = $Description == null ? "" : $Description.text;

            if ($Identifier != null || $Get.v instanceof SEGet) {
                if ($decorators != null) {
                    $v = new SESet(a, sub, new SELambda(a, $Definition.v, org.coyove.eugine.util.List.build(
                        new SECall($decorators, org.coyove.eugine.util.List.build(
                            new SELambda(a, $Definition.v, $body, desc)), 
                            new Atom($Decorator.start), null)
                    )), SESet.DECLARE.DECLARE, SESet.ACTION.IMMUTABLE);
                } else {
                    $v = new SESet(a, sub, new SELambda(a, $Definition.v, $body, desc), 
                        SESet.DECLARE.DECLARE, SESet.ACTION.IMMUTABLE);
                }
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
        $v = new SEDef(new Atom($definitionsList.start), null, $definitionsList.v, "", $body);
    }
    ;

callStmt returns [SExpression v]
    : Identifier argumentsList {
        String func = $Identifier.text;
        if (SKeywordsANTLR.KeywordsLookup.containsKey(func)) {
            $v = SKeywordsANTLR.KeywordsLookup.get(func).call($Identifier, $argumentsList.v); 
        } else {
            $v = new SECall(new SEVariable($Identifier.text), $argumentsList.v, new Atom($Identifier), null);
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
            $v = new SECond(new Atom($Switch), $Condition.v, $branches, $db);
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
    | callStmt
        { $v = $callStmt.v; }
    | Called=topExpr Op=('::' | ':') Method=Identifier interopArgumentsList 
        {
            $v = new SEInteropMethod(new Atom($Called.start), $Called.v,
                $Method.text, $interopArgumentsList.defs, $interopArgumentsList.args, 
                $Op.text.equals("::") ? 
                    SEInteropMethod.RETURN_TYPE.CAST_TO_SVALUE :
                    SEInteropMethod.RETURN_TYPE.DIRECT_RETURN);
        }
    | Called=topExpr argumentsList
        { $v = new SECall($Called.v, $argumentsList.v, new Atom($Called.start), null); }
    | lambdaStmt
        { $v = $lambdaStmt.v; }
    | Subject=topExpr '[' Key=expr ']'
        {
            $v = new SEGet(new Atom($Subject.start), $Subject.v, org.coyove.eugine.util.List.build($Key.v));
        }
    | Subject=topExpr '.' Identifier
        {
            $v = new SEGet(new Atom($Subject.start), $Subject.v, 
                org.coyove.eugine.util.List.build(new SString($Identifier.text)));
        }
    | Identifier    
        { $v = new SEVariable($Identifier.text); }
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
            $v = SKeywordsANTLR.KeywordsLookup.get($Not.text).call($Not, 
                org.coyove.eugine.util.List.build($Right.v));
        }
    | Left=unaryExpr Op=('++' | '--')
        {
            Atom ha = new Atom($Op);
            if ($Op.text.equals("++")) {
                $v = new SESet(ha, $Left.v, 
                    new SEAdd(ha, org.coyove.eugine.util.List.build($Left.v, new SInteger(1)), false),
                    SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
            } else {
                $v = new SESet(ha, $Left.v, 
                    new SEElemArith(ha, 
                        org.coyove.eugine.util.List.build($Left.v, new SInteger(1)), SEElemArith.ACTION.SUBTRACT),
                    SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
            }
        }
    ;

multiplyExpr returns [SExpression v]
    : Top=unaryExpr { $v = $Top.v; }
    | Left=multiplyExpr Op=('*'|'/'|'%') Right=unaryExpr
        {
            $v = SKeywordsANTLR.KeywordsLookup.get($Op.text).call($Op, 
                org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    ;

addExpr returns [SExpression v]
    : Top=multiplyExpr { $v = $Top.v; }
    | Left=addExpr AddOp=('+'|'+.') Right=multiplyExpr
        {
            $v = new SEAdd(new Atom($AddOp), 
                org.coyove.eugine.util.List.build($Left.v, $Right.v), $AddOp.text.equals("+."));
        }
    | Left=addExpr Sub Right=multiplyExpr
        {
            $v = new SEElemArith(new Atom($Sub), 
                org.coyove.eugine.util.List.build($Left.v, $Right.v), SEElemArith.ACTION.SUBTRACT);
        }
    ;

compareExpr returns [SExpression v]
    : Top=addExpr { $v = $Top.v; }
    | Left=compareExpr Op=('<'|'>'|'<='|'>='|'=='|'!=') Right=addExpr
        {
            $v = SKeywordsANTLR.KeywordsLookup.get($Op.text).call($Op, 
                org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    ;

logicExpr returns [SExpression v]
    : Top=compareExpr { $v = $Top.v; }
    | Left=logicExpr Op=('&&'|'||') Right=compareExpr
        {
            $v = SKeywordsANTLR.KeywordsLookup.get($Op.text).call($Op, 
                org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    ;

assignExpr returns [SExpression v]
    :   Top=logicExpr { $v = $Top.v; }
    |   Left=unaryExpr Op=('+=' | '-=' | '*=' | '/=') Right=assignExpr
        {
            Atom ha = new Atom($Op);
            if ($Op.text.equals("+=")) {
                $v = new SESet(ha, $Left.v, 
                    new SEAdd(ha, org.coyove.eugine.util.List.build($Left.v, $Right.v), false),
                    SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
            } else {
                String text = $Op.text.substring(0, 1);
                $v = new SESet(ha, $Left.v, 
                    SKeywordsANTLR.KeywordsLookup.get(text).call($Op, 
                        org.coyove.eugine.util.List.build($Left.v, $Right.v)),
                    SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
            }
        }
    ;

javaNewExpr returns [SExpression v]
    : New JavaFullName interopArgumentsList
        {
            String classname = $JavaFullName.text.replace("\\", ".");
            $v = new SEInteropNew(new Atom($New), getClassByName(classname, $New),
                $interopArgumentsList.defs, $interopArgumentsList.args);
        }
    ;

expr returns [SExpression v]
    : assignExpr { $v = $assignExpr.v; }
    | javaNewExpr { $v = $javaNewExpr.v; }
    | Static JavaFullName
        { $v = getClassByName($JavaFullName.text.replace("\\", "."), $Static); }
    | Clone Subject=expr
        {
            $v = new SEClone(new Atom($Clone), $Subject.v);
        }
    | For Subject=expr Do Body=expr
        { 
            $v = new SEFor(new Atom($For), $Subject.v, $Body.v, 
                $For.text.equals("for") ? SEFor.DIRECTION.ASC : SEFor.DIRECTION.DESC); 
        }
    | For Start=expr (',' Next=expr)? ('..' | '...') End=expr Do Body=expr
        { 
            SEIRange r = new SEIRange(new Atom($For), org.coyove.eugine.util.List.build(
                    $Start.v, 
                    $Next.ctx == null ? 
                        new SInteger(1) : 
                        new SEElemArith(new Atom($Next.start), 
                            org.coyove.eugine.util.List.build($Next.v, $Start.v),
                            SEElemArith.ACTION.SUBTRACT), 
                    $End.v
                ));
            $v = new SEFor(new Atom($For), r, $Body.v, SEFor.DIRECTION.ASC); 
        }
    | If Condition=expr True=code (Else False=code)?
        {
            $v = new SEIf(new Atom($If), $Condition.v, $True.v, $False.start == null ? null : $False.v);
        }
    | switchStmt
        { $v = $switchStmt.v; }
    | list
        { $v = $list.v; }
    | dict
        { $v = $dict.v; }
    ;