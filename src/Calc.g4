grammar Calc;
//Target lan
options{
language=Java;}
//Parser rules
input:plusMinus			#Calculate
| setVar                #Set
;
setVar: ID '=' plusMinus  #Variable
;
plusMinus:
plusMinus '+' mulDiv 		#Plus
| plusMinus '-' mulDiv 		#Minus
| mulDiv                    #ToMulDiv
;
mulDiv:
mulDiv '*' mulDiv     		#Mul
| mulDiv '/' mulDiv	     	#Div
| atom                          #ToAtom
;

atom:
'(' plusMinus ')' 	    	#Braces
| INT                        #Int
|'cos' '(' INT ')'  		#Cos
|'sin' '(' INT ')' 		#Sin
|'tan' '(' INT ')'		#Tan
;
                           

//Lexer rules
INT:[0-9]+;
ID:[a-zA-Z_][a-zA-Z_0-9]* ;
WS :[ \t\r\n]+ ->skip;