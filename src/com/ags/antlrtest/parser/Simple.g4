grammar Simple;
@header{
package com.ags.antlrtest.parser;
}
prog: stat+ ;
stat : expr NL 						# printExpr
     | ID EQU expr NL				# assign
     | NL							# blank
     ;
     

expr : expr (MUL | DIV) expr		# MulDiv
     | expr (ADD | SUB) expr		# AddSub
     | ('-')? FLOAT  				# float
     | ('-')? INT 					# int       
     | ID							# id
     | '(' expr ')' 				# parens
     ;


EQU : '=' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-z]+ ;

INT : DIGIT+;

FLOAT : DIGIT+ '.' DIGIT*
      | '.' DIGIT+
      ;
      
NL : '\r'?'\n' ;
WS : [\t]+ -> skip;

fragment 
DIGIT: [0-9];

