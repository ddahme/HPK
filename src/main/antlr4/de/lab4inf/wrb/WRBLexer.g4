lexer grammar WRBLexer;

@lexer::members {
    boolean ignore=true;
}


ADD : '+';
SUB : '-';
DIV : '/';
MUL : '*';
EXP : '^'|'**';
MOD : '%';

COLONE : ':';
SEMICOLONE : ';';
DOT : '.';
COMMA : ',';
ASSIGN : '=';
UNDERLINE : '_';

LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']'; 
 

INFINITY: 'Infinity';

ID : LETTER (LETTER|DIGIT|UNDERLINE|DOT)*;

//(('E'|'e') (SUB)? DIGIT*)? for scientific notation) 
DOUBLE_ : INTEGER DOT (DIGIT)* (('E'|'e') (SUB)? DIGIT*)?; 

INTEGER : DIGIT+ ;

fragment LETTER : [a-z|A-Z];
fragment DIGIT : [0-9]; 

WS : [ \r\t\n] -> skip ;


