lexer grammar WRBLexer;

@lexer::members {
    boolean ignore=true;
}


ADD : '+';
SUB : '-';
DIV : '/';
MUL : '*';
MOD : '%';
POW: ('**'|'^');

COMMA: ',';
COLONE : ':';
SEMICOLONE : ';';
DOT : '.';
ASSIGN : '=';
UNDERLINE : '_';

LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']'; 
 
//TODO ignore upper-case and lower-case; InFiNIty should also be valid
INFINITY: 'Infinity';

ID : LETTER (LETTER|DIGIT|UNDERLINE|DOT)*;

//(('E'|'e') (SUB)? DIGIT*)? for scientific notation) 
DOUBLE_ : INTEGER DOT (DIGIT)* (('E'|'e') (SUB)? DIGIT*)?; 

INTEGER : DIGIT+ ;

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9]; 

WS : [ \r\t\n] -> skip ;
//SPACE : ' ' { if(ignore) skip(); };

