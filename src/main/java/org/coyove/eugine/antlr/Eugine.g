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

block returns [SExpression v]
    @init { $v = new SEChain(); }
    : (stmt { ((SEChain) $v).expressions.add($stmt.v); })+
;

stmt returns [SExpression v]
    : importStmt Semi   { $v = new SNull(); }
    | declareStmt Semi  { $v = $declareStmt.v; }
    | defineStmt        { $v = $defineStmt.v; }
    | expr Semi         { $v = $expr.v; }
    | Semi              { $v = new SNull(); }
;

importStmt : 'import' Identifier;

declareStmt returns [SExpression v]
    : Var Identifier '=' expr {
        $v = new SESet(new SString($Identifier.text), $expr.v, 
            SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
    }
;

definitionsList returns [org.coyove.eugine.util.List<String> v = new org.coyove.eugine.util.List<String>(); ]
    : '(' (InitArg=expr ',' { $v.add($InitArg.text); } )* LastArg=expr ')' {
        $v.add($LastArg.text);
    }
    | '(' ')'
;

defineStmt returns [SExpression v]
    locals [ org.coyove.eugine.util.List<SExpression> body = new org.coyove.eugine.util.List<SExpression>(); ]
    : Def Identifier definitionsList Desc=(RawString | StringLiteral)? 
        (('{' (stmt { $body.add($stmt.v); })* '}')|(stmt { $body.add($stmt.v); })) {
        $v = new SEDef(new Atom($Identifier), $Identifier.text, $definitionsList.v, 
            $Desc == null ? "" : $Desc.text, $body);
    }
;

callStmt returns [SExpression v]
    locals [ org.coyove.eugine.util.List<SExpression> arguments = 
        new org.coyove.eugine.util.List<SExpression>() ] 
    : Identifier '(' 
        (InitExpr=expr ',' { $arguments.add($InitExpr.v); } )* 
        LastExpr=expr 
    ')' {
        $arguments.add($LastExpr.v);
        String func = $Identifier.text;

        if (SKeywordsANTLR.KeywordsLookup.containsKey(func)) {
            $v = SKeywordsANTLR.KeywordsLookup.get(func).call($Identifier, $arguments); 
        } else {
            $v = new SECall(new SEVariable($Identifier.text), $arguments, new Atom($Identifier), null);
        }
    }
    | Identifier '(' ')' {
        $v = new SECall(new SEVariable($Identifier.text), $arguments, new Atom($Identifier), null);
    }
;

dict returns [SExpression v]
    locals [ HashMap<String, SExpression> ret = new HashMap<String, SExpression>(); ]
    : '{' pair { $ret.put($pair.k, $pair.v); } (',' pair { $ret.put($pair.k, $pair.v); } )* '}'
        { $v = new SDict($ret); }
    | '{' '}'
        { $v = new SDict($ret); }
    ;

pair returns [String k, SExpression v]
    : Key=(StringLiteral | RawString | Identifier) ':' Value=value
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

expr returns [SExpression v]
    : Sub Right=expr
        {
            if ($Right.v instanceof SInteger) {
                $v = new SInteger(-((SInteger) $Right.v).<Long>get());
            } else if ($Right.v instanceof SDouble) {
                $v = new SDouble(-((SDouble) $Right.v).<Double>get());
            } else {
                $v = new SEReverse(new Atom($Sub), org.coyove.eugine.util.List.build($Right.v)); 
            }
        }
    | Left=expr MathOp=('*'|'/') Right=expr 
        { 
            $v = SKeywordsANTLR.KeywordsLookup.get($MathOp.text).
            call($MathOp, org.coyove.eugine.util.List.build($Left.v, $Right.v)); 
        }
    | Left=expr Sub Right=expr 
        { 
            $v = SKeywordsANTLR.KeywordsLookup.get("-").
            call($Sub, org.coyove.eugine.util.List.build($Left.v, $Right.v)); 
        }
    | Left=expr AddOp=('+'|'+.') Right=expr 
        { 
            $v = SKeywordsANTLR.KeywordsLookup.get($AddOp.text).
            call($AddOp, org.coyove.eugine.util.List.build($Left.v, $Right.v)); 
        }
    | Identifier    
        { $v = new SEVariable($Identifier.text); }
    | RawString     
        {
            String t = $RawString.text; 
            t = t.substring(1, t.length() - 1);
            $v = new SString(t.replace("\"\"", "\""));
        }
    | StringLiteral 
        { 
            String t = $StringLiteral.text; 
            $v = new SString(t.substring(1, t.length() - 1)); 
        }
    | Integer
        { $v = new SInteger($Integer.text); }
    | Double
        { $v = new SDouble($Double.text); }
    | '(' Inner=expr ')'
        { $v = $Inner.v; }
    | callStmt
        { $v = $callStmt.v; }
    | list
        { $v = $list.v; }
    | dict
        { $v = $dict.v; }
    ;