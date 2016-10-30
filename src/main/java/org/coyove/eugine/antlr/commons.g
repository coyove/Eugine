lexer grammar CommonLexerRules;

Var: 'var';
Def: 'def';

Add : '+' ;
Sub : '-' ;

Integer: [0-9]+ ;                   // match integers
Double: [0-9]+ '.' [0-9]+ ;
NEWLINE:'\r'? '\n' -> skip  ;   // return newlines to parser (end-statement signal)
WS: [ \t]+ -> skip ;            // toss out whitespace
Semi: ';' ;
Identifier : (LETTER | '_')(LETTER | '_' | DIGIT)* ;
LETTER: ('A'..'Z' | 'a' .. 'z');
DIGIT: ('0'..'9');

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