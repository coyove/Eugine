lexer grammar CommonLexerRules;

Var: 'var';
Def: 'def';
For: ('for' | 'forr');
If: 'if';
Switch: 'switch';
Else: 'else';
Enter: 'enter';
Catch: 'catch';
Clone: 'clone';
New: 'new';
Static: 'static';
Do: 'do';
Add : '+' ;
Sub : '-' ;
Not: '!';
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
    : (Letter | '_')(Letter | '_' | [0-9])* '...'?
    ;

JavaFullName
    : Identifier ('\\' Identifier)* '[]'? '...'?
    ;

Letter
	: ('A'..'Z' | 'a'..'z')
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