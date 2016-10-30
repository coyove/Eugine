lexer grammar CommonLexerRules;

Var: 'var';
Def: 'def';

Add : '+' ;
Sub : '-' ;

Integer
    : [0-9]+
    ;

Double
    : ([0-9]+ '.' [0-9]+ | ([0-9]+ '.' [0-9]+ [eE] [\+\-]? [0-9]+))
    ;

NEWLINE:'\r'? '\n' -> skip  ;   // return newlines to parser (end-statement signal)
WS: [ \t]+ -> skip ;            // toss out whitespace
Semi
    : ';' 
    ;

Identifier 
    : (LETTER | '_')(LETTER | '_' | [0-9])* 
    ;

LETTER: ('A'..'Z' | 'a' .. 'z');

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