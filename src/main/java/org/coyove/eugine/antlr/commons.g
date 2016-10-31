lexer grammar CommonLexerRules;

Var: 'var';
Def: 'def';
For: ('for' | 'forr');
If: 'if';
Else: 'else';

Add : '+' ;
Sub : '-' ;
AryOp: ('-'|'*'|'/'|'%'|'=='|'!='|'>'|'<'|'>='|'<=') ;

Integer
    : [0-9]+
    ;

Double
    : ([0-9]+ '.' [0-9]+ | ([0-9]+ '.' [0-9]+ [eE] [\+\-]? [0-9]+))
    ;

NEWLINE:'\r'? '\n' -> skip  ;
WS: [ \t]+ -> skip ;
Semi
    : ';' 
    ;

Identifier 
    : (LETTER | '_')(LETTER | '_' | [0-9])* '...'?
    ;

LETTER: ('A'..'Z' | 'a'..'z');

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