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
    : importStmt Semi   { $v = new SNull(); }
    | ifStmt            { $v = $ifStmt.v; }
    | declareStmt Semi  { $v = $declareStmt.v; }
    | defineStmt        { $v = $defineStmt.v; }
    | expr Semi         { $v = $expr.v; }
    | Semi              { $v = new SNull(); }
    ;

importStmt : 'import' Identifier;

ifStmt returns [SExpression v]
    : If Condition=expr True=code (Else False=code)?
        {
            $v = new SEIf(new Atom($If), $Condition.v, $True.v, $False.start == null ? null : $False.v);
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
        (('{' (stmt { $body.add($stmt.v); })* '}')|(stmt { $body.add($stmt.v); })) 
    {
        $v = new SEDef(new Atom($Identifier), $Identifier.text, $definitionsList.v, 
            $Desc == null ? "" : $Desc.text, $body);
    }
    ;

lambdaStmt returns [SExpression v]
    locals [ org.coyove.eugine.util.List<SExpression> body = new org.coyove.eugine.util.List<SExpression>(); ]
    : definitionsList '=>' ('{' (stmt { $body.add($stmt.v); })* '}'| expr { $body.add($expr.v); })
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

castExpression
    :   unaryExpression
    |   '(' typeName ')' castExpression
    |   '__extension__' '(' typeName ')' castExpression
    ;

multiplicativeExpression
    :   castExpression
    |   multiplicativeExpression '*' castExpression
    |   multiplicativeExpression '/' castExpression
    |   multiplicativeExpression '%' castExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

shiftExpression
    :   additiveExpression
    |   shiftExpression '<<' additiveExpression
    |   shiftExpression '>>' additiveExpression
    ;

relationalExpression
    :   shiftExpression
    |   relationalExpression '<' shiftExpression
    |   relationalExpression '>' shiftExpression
    |   relationalExpression '<=' shiftExpression
    |   relationalExpression '>=' shiftExpression
    ;

equalityExpression
    :   relationalExpression
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

andExpression
    :   equalityExpression
    |   andExpression '&' equalityExpression
    ;

exclusiveOrExpression
    :   andExpression
    |   exclusiveOrExpression '^' andExpression
    ;

inclusiveOrExpression
    :   exclusiveOrExpression
    |   inclusiveOrExpression '|' exclusiveOrExpression
    ;

logicalAndExpression
    :   inclusiveOrExpression
    |   logicalAndExpression '&&' inclusiveOrExpression
    ;

logicalOrExpression
    :   logicalAndExpression
    |   logicalOrExpression '||' logicalAndExpression
    ;

expr returns [SExpression v]
    : callStmt
        { $v = $callStmt.v; }
    | Called=expr argumentsList
        { $v = new SECall($Called.v, $argumentsList.v, new Atom($Called.start), null); }
    | lambdaStmt
        { $v = $lambdaStmt.v; }
    | Identifier '=' Value=expr
        { 
            $v = new SESet(new SString($Identifier.text), $Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
        }
    | Subject=expr '=' Value=expr
        {
            $v = new SESet($Subject.v, $Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
        }
    | Sub Right=expr
        {
            if ($Right.v instanceof SInteger) {
                $v = new SInteger(-((SInteger) $Right.v).<Long>get());
            } else if ($Right.v instanceof SDouble) {
                $v = new SDouble(-((SDouble) $Right.v).<Double>get());
            } else {
                $v = new SEReverse(new Atom($Sub), org.coyove.eugine.util.List.build($Right.v)); 
            }
        }
    | Left=expr Op=('-'|'*'|'/'|'%'|'=='|'!='|'>'|'<'|'>='|'<='|'&&'|'||') Right=expr 
        { 
            $v = SKeywordsANTLR.KeywordsLookup.get($Op.text).call($Op, org.coyove.eugine.util.List.build($Left.v, $Right.v));
        }
    | Left=expr AddOp=('+'|'+.') Right=expr 
        { 
            $v = new SEAdd(new Atom($AddOp), 
                org.coyove.eugine.util.List.build($Left.v, $Right.v), $AddOp.text.equals("+."));
        }
    | '(' Inner=expr ')'
        { $v = $Inner.v; }
    | For Subject=expr 'do' Body=expr
        { 
            $v = new SEFor(new Atom($For), $Subject.v, $Body.v, 
                $For.text.equals("for") ? SEFor.DIRECTION.ASC : SEFor.DIRECTION.DESC); 
        }
    | For Start=expr (',' Next=expr)? ('..' | '...') End=expr 'do' Body=expr
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
    | Subject=expr '[' Key=expr ']'
        {
            $v = new SEGet(new Atom($Subject.start), $Subject.v, org.coyove.eugine.util.List.build($Key.v));
        }
    | Subject=expr '.' Identifier
        {
            $v = new SEGet(new Atom($Subject.start), $Subject.v, 
                org.coyove.eugine.util.List.build(new SString($Identifier.text)));
        }
    | list
        { $v = $list.v; }
    | dict
        { $v = $dict.v; }
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