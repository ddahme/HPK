parser grammar WRBParser;

options {
	language = Java;
	tokenVocab = WRBLexer;
}
 
/*entry point*/ 
eval : program EOF;

program			:	programPart (SEMICOLONE programPart)* (SEMICOLONE)?;

programPart		:	assigntion
				|	functionCreate
				|	expr
				;

functionCreate 	: 	name=ID LPAREN (ID) (COMMA ID)* RPAREN ASSIGN body=expr;

functionCall	:	name=ID LPAREN (expr) (COMMA expr)* RPAREN;

assigntion 		: 	left=ID ASSIGN sign=SUB? right=ID			#VarToVar
				|	ID ASSIGN expr								#VarToExpr
				;

expr 			:	addTerm;

addTerm			:	mulTerm ( (ADD|SUB) mulTerm)*;

mulTerm			:	expTerm ( (MUL|DIV) expTerm)*;

expTerm			:	atom ( (EXP) atom)*;

atom			:	SUB? (LPAREN expr RPAREN)					#Parens
				|	SUB? ID										#Id
				|	number										#Value
				|	constant									#SetConstant
				|	functionCall								#FunctionAtom
				;

constant 		:	number SEMICOLONE;

number			:	SUB? val=(INTEGER | DOUBLE_);

