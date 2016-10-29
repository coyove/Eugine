lexer grammar CommonLexerRules;

VAR: 'var';

Integer: [0-9]+ ;                   // match integers
Double: [0-9]+ '.' [0-9]+ ;
NEWLINE:'\r'? '\n' -> skip  ;   // return newlines to parser (end-statement signal)
WS: [ \t]+ -> skip ;            // toss out whitespace
SEMI: ';' ;
ID : (LETTER | '_')(LETTER | '_' | DIGIT)* ;
LETTER: ('A'..'Z' | 'a' .. 'z');
DIGIT: ('0'..'9');

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