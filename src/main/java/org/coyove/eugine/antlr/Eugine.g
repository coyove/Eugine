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
}

@parser::members {
}

prog returns [SExpression v]
    : (block { $v = $block.v; } )+ 
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
    : Var Identifier '=' expr 
        {
            $v = new SESet(new SString($Identifier.text), $expr.v, 
                SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
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

defineStmt returns [SExpression v]
    locals [ org.coyove.eugine.util.List<SExpression> body = new org.coyove.eugine.util.List<SExpression>(); ]
    : Def Identifier definitionsList Desc=(RawString | StringLiteral)? '='
        ('{' (stmt { $body.add($stmt.v); })* '}' | stmt { $body.add($stmt.v); }) 
        {
            $v = new SEDef(new Atom($Identifier), $Identifier.text, $definitionsList.v, 
                $Desc == null ? "" : $Desc.text, $body);
        }
    | Def Get=expr definitionsList Desc=(RawString | StringLiteral)? '='
        ('{' (stmt { $body.add($stmt.v); })* '}' | stmt { $body.add($stmt.v); }) 
        {
            if ($Get.v instanceof SEGet) {
                $v = new SESet($Get.v,
                    new SELambda(new Atom($Def), $definitionsList.v, $body),
                    SESet.DECLARE.DECLARE, SESet.ACTION.IMMUTABLE);
            } else {
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

expr returns [SExpression v]
    : logicExpr 
        { $v = $logicExpr.v; }
    | Identifier '=' Value=expr
        {
            $v = new SESet(new SString($Identifier.text), $Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
        }
    | Subject=expr '=' Value=expr
        {
            $v = new SESet($Subject.v, $Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
        }
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
    | list
        { $v = $list.v; }
    | dict
        { $v = $dict.v; }
    ;