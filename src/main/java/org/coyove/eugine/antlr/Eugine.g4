grammar Eugine;

@header
{
package org.coyove.eugine.antlr;
}

Var: 'var';
Let: 'let';
Def: 'def';
Inline: 'inline';
Coroutine: 'coroutine';
Struct: 'struct';
Operator: 'operator';
For: ('for' | 'rev');
If: 'if';
Switch: 'switch';
Else: 'else';
Enter: 'enter';
Catch: 'catch';
Clone: 'clone';
Sync: 'sync';
Yield: 'yield';
New: 'new';
Static: 'static';
Do: 'do';

Integer
    :   [0-9]+
    ;

Double
    :   ([0-9]+ '.' [0-9]+ | ([0-9]+ '.' [0-9]+ [eE] [+-]? [0-9]+))
    ;

NEWLINE
    :   '\r'? '\n' -> skip
    ;

WS  :   [ \t]+ -> skip 
    ;

Semi
    :   ';' 
    ;
    
Identifier 
    :   (Letter | '_')(Letter | '_' | [0-9])* '...'?
    ;

JavaFullName
    :   Identifier ('/' Identifier)* '[]'? '...'?
    ;

Letter
    :   ('A'..'Z' | 'a'..'z')
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

RawString
    :   '@"' (~'"' | '""')* '"'
    ;

StringLiteral
    :   '"' SCharSequence? '"'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   '\\' ['"?abfnrtv\\]
    |   '\\\n'              // Added line
    |   '\\\r\n'            // Added line
    ;

prog
    : (block)+ 
    | EOF
;

code
    : ('{' B1=block '}' | B2=stmt)
    | '{' '}'
    ;

block
    : (stmt)+
;

stmt
    : importStmt 
    | enterStmt  
    | declareStmt
    | defineStmt 
    | expr       
    | Semi       
    ;

importStmt 
    : ('import' | 'reload') (Identifier ('.' Identifier)*)
    ;

enterStmt
    : Enter Body=code (Catch '(' Identifier ')' CatchBody=code)? (Do DoBody=code)?
    ;

syncStmt
    : Sync Body=code
    ;

declareStmt
    :   Action=(Var | Let) 
        Head=unaryExpr '=' HeadValue=expr
        (',' Tail=unaryExpr '=' TailValue=expr)*
    ;

parametersList 
    :   '(' 
            LastStyle='&'? LastArg=Identifier
            (',' InitStyle='&'? InitArg=Identifier)*
        ')'
    |   '(' ')'
    ;

argumentsList
    :   '(' 
            HeadExpr=expr
            (',' TailExpr=expr )*
        ')'
    |   '(' ')'
    ;

interopArgumentDeclaration
    :   InitExpr=expr (':' InitDef=(JavaFullName | Identifier))?
    ;

interopArgumentsList
    : '(' 
        (InitExpr=interopArgumentDeclaration ',')* 
        LastExpr=interopArgumentDeclaration
    ')'
    | '(' ')'
    ;

defineStmt
    :   Def Inline? Coroutine? Struct? Operator? Get='getter'? Set='setter'?
        ('[' Decorator=expr argumentsList? ']')*
        FunctionName=expr Lambda=lambdaStmt
    ;

lambdaStmt
    :   Parameters=parametersList 
        Description=(RawString | StringLiteral)?
        '=>' 
        ('@' Identifier ('(' InitValue=expr ')')?)?
        ('{' (stmt)* '}'| stmt)
    ;

switchStmt
    :   Switch Condition=expr Do '{' (Tester=expr '=>' Code=code)* '}'
    ;

dict
    : '{' 
        pair
        (',' pair)* ','? 
        '}'
    | '{' '}'
    ;

pair
    : Key=(StringLiteral | RawString) ':' Value=value
    | Key=Identifier ':' Value=value
    ;

list
    :   '[' 
            (value)
            (',' value)* 
        ','? 
        ']'
    |   '[' ']'
    ;

value
    : expr
    | dict
    | list
    ;

topExpr
    :   '(' Inner=stmt ')'
    |   lambdaStmt
    |   'true'
    |   'false'
    |   'null'
    |   'break'
    |   Identifier    
    |   RawString     
    |   StringLiteral 
    |   Integer
    |   Double
    ;

postfixExpr
    :   Top=topExpr
    |   Left=postfixExpr Op='++' 
    |   Left=postfixExpr Op='--' 
    |   Subject=postfixExpr '[' Key=expr ']'
    |   Subject=postfixExpr '[' Start=expr ('..' | '...') (End=expr)? ']'
    |   Subject=postfixExpr '.' Identifier
    |   Called=postfixExpr Op=('::' | ':>') Method=Identifier Ial=interopArgumentsList 
    |   Called=postfixExpr Mt='#'? argumentsList
    |   Called=postfixExpr '<' Identifier '>'
    ;

unaryExpr
    :   Top=postfixExpr
    |   Sub='-' Right=postfixExpr
    |   Not='!' Right=postfixExpr
    |   Op='++' Left=unaryExpr
    |   Op='--' Left=unaryExpr
    ;

multiplyExpr
    : Top=unaryExpr
    | Left=multiplyExpr Op='*' Right=unaryExpr
    | Left=multiplyExpr Op='/' Right=unaryExpr
    | Left=multiplyExpr Op='%' Right=unaryExpr
    ;

addExpr
    : Top=multiplyExpr
    | Left=addExpr AddOp='+' Right=multiplyExpr
    | Left=addExpr AddOp='<+' Right=multiplyExpr
    | Left=addExpr Sub='-' Right=multiplyExpr
    ;

compareExpr
    : Top=addExpr
    | Left=compareExpr Op=('<' | '<=' | '==' | '!=' | '>=' | '>') Right=addExpr
    ;

logicExpr
    : Top=compareExpr
    | Left=logicExpr Op='&&' Right=compareExpr
    | Left=logicExpr Op='||' Right=compareExpr
    ;

assignExpr
    : Top=logicExpr
    | Left=unaryExpr Op='+=' Right=assignExpr
    | Left=unaryExpr Op='-=' Right=assignExpr
    | Left=unaryExpr Op='*=' Right=assignExpr
    | Left=unaryExpr Op='/=' Right=assignExpr
    | Subject=assignExpr '=' Value=expr
    ;

expr
    : assignExpr
    | '@' MetaExpression=expr
    | New JavaFullName interopArgumentsList
    | Static JavaFullName
    | Clone Subject=expr
    | Sync SyncBody=code 
    | Yield (Yielded=expr | '(' ')')
    | For Subject=expr Do Body=expr
    | For Start=expr (',' Next=expr)? ('..' | '...') End=expr Do Body=expr
    | If Condition=expr True=code (Else False=code)?
    | switchStmt
    | list
    | dict
    ;