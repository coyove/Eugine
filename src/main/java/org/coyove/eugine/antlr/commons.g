lexer grammar CommonLexerRules;

Import: 'import';

Var: 'var';

Let: 'let';

Def: 'def';

Struct: 'struct';

Operator: 'operator';

For: 'for';

If: 'if';

Switch: 'switch';

Else: 'else';

Enter: 'enter';

Catch: 'catch';

Sync: 'sync';

Do: 'do';

AssignOp: ('+=' | '-=' | '*=' | '/=' | '%=' | '|=' | '&=' | '^=');

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