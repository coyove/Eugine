grammar Eugine;
import commons;

@header
{
package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
}

@parser::members {
}

prog returns [SExpression v]
    : (stmt { $v = $stmt.v; } )+ ;

stmt returns [SExpression v]
    : expr SEMI          { $v = $expr.v; }
    | declareStmt SEMI   { $v = $declareStmt.v; }
    | SEMI
;

declareStmt returns [SExpression v]
    : VAR ID '=' expr {
        $v = new SESet(new SString($ID.text), $expr.v, 
            SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
    }
;

expr returns [SExpression v]
    //: a=expr op=('*'|'/') b=expr {$v = eval($a.v, $op.type, $b.v);}
    //| a=expr op=('+'|'-') b=expr {$v = eval($a.v, $op.type, $b.v);}
    //| INT {$v = $INT.int;}

    : ID            { $v = new SEVariable($ID.text); }
    | StringLiteral { $v = new SString($StringLiteral.text); }
    | Integer       { $v = new SInteger($Integer.text); }
    | Double        { $v = new SDouble($Double.text); }
    | '(' expr ')'  { $v = $expr.v; }
;

MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;