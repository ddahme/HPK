parser grammar WRBParser;

options {
	language = Java;
	tokenVocab = WRBLexer;
}
 
/*entry point*/ 
eval : declareVarExp EOF;

/*
 * valid -> expr
 * valid -> ID = expr
 * valid -> ID = expr;
 * valid -> ID = expr; ID = expr
 * valid -> ID = expr; ID = expr;
 * valid -> ID1 = expr; ID2 = ID1
 * valid -> ID1 = expr; ID2 = ID1;
 * 
 * error -> ID = expr ID = expr
 */
//declareVarExp	: (assignVar | assignFunc | expr) ((SEMICOLONE declareVarExp)* | (SEMICOLONE?));
declareVarExp	: (assignVarToVar | assignVar | assignFunc | expr) ((SEMICOLONE declareVarExp)* | (SEMICOLONE?));
				
assignVarToVar	: left=ID ASSIGN sign=SUB? right=ID;

assignVar	:	ID ASSIGN expr;

assignFunc	: name=ID LPAREN ID (COMMA ID)* RPAREN ASSIGN value=expr;

expr : term ( operator+=(ADD|SUB) term)*					#addsub;

term : atomExp ( operator+=(MUL|DIV) atomExp)* 				#multdiv;

atomExp	:	SUB? (LPAREN expr RPAREN)						#parens
		|	sign=SUB? INFINITY								#infinity
		|	SUB? ID											#id
		|	number											#val
		|	name=ID LPAREN expr (COMMA expr)* RPAREN		#functionAtom
		|	atomExp (POW atomExp)+							#pow
		;

number : SUB? val=(INTEGER | DOUBLE_);


