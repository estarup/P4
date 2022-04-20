grammar Hello;

options {
    language = Java;
}

// parser rules // 
trafficProg : statement* EOF ;
statement :   method
			| if_statement
	        | while_loop
	        | create_statement
  			| assignment
			| declaration SEMICOLON
			;
method : METH_RETURN_TYPE METH_NAME method_parameter curl_statement   // declare method
            | METH_RETURN_TYPE METH_NAME method_no_parameter curl_statement
			| METH_NAME method_parameter SEMICOLON
			| METH_NAME method_no_parameter SEMICOLON
			;
if_statement : IF  logic_expression curl_statement else_statement? ;
while_loop : WHILE logic_expression curl_statement ;
create_statement : CREATE create_type create_name curl_statement;
create_type : CAR
            | CARSPAWNER
            | TRAFFICLIGHT
            | GRID ;
create_name : ID;
assignment : ID ASSIGN expression SEMICOLON;
declaration : NUM_TYPE ID ;
method_parameter : LPAREN declaration RPAREN ;
method_no_parameter : LPAREN RPAREN ;
curl_statement : LCURL statement* return_statement? RCURL ;
return_statement : RETURN ID SEMICOLON;
logic_expression : LPAREN condition RPAREN; 
else_statement : ELSE curl_statement;
expression : term
            | add_expression
            | subtract_expression
            ;
add_expression :  term ADD term;
subtract_expression : term SUBTRACT term;
condition :   expression
            | equal_condition
            | not_equal_condition
            | less_than_condition
            | more_than_condition
            | more_or_equal_condition
            | less_or_equal_condition
			| BOOL ;
equal_condition : expression EQUAL term;
not_equal_condition: expression NOTEQUAL term;
less_than_condition : expression LESSTHAN term;
more_than_condition : expression MORETHAN term;
more_or_equal_condition : expression MOREOREQUAL term;
less_or_equal_condition : expression LESSOREQUAL term;

term : factor
       | multiply_term
       | divide_term;
multiply_term : factor MULTIPLY factor;
divide_term : factor DIVIDE factor;
factor : LPAREN expression RPAREN
		| INTEGER
		| FLOAT
	    | ID ;

// Lexer rules // 

// Literals
METH_RETURN_TYPE : VOID | 'Int' | 'Float' ;
NUM_TYPE : 'int' | 'float' ;
INTEGER : [0]| ('-')? [1-9][0-9]* ;
FLOAT : INTEGER '.'[0-9]* ;

// Operators 0
ADD : '+' ;
SUBTRACT : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
ASSIGN : '=' ;

// Logic operators
EQUAL : '==' ;
NOTEQUAL : '!=' ;
LESSTHAN : '<' ; 
MORETHAN : '>' ;
LESSOREQUAL : '<=' ;
MOREOREQUAL : '>=' ;

// Brackets
LCURL : '{'  ;
RCURL : '}'  ;
LPAREN : '(' ;
RPAREN : ')' ;

// TEST 
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
VOID : 'void' ;
CREATE : 'create' ;
START : 'Start' ;
RETURN : 'return';
CAR :  'Car';
CARSPAWNER: 'CarSpawner' ;
TRAFFICLIGHT : 'TrafficLight'; 
GRID : 'Grid' ;
CAR_NAME : 'car' [a-zA-Z0-9]*;
CARSPAWNER_NAME : 'carSpawner' [a-zA-Z0-9]*;
TRAFFICLIGHT_NAME : 'trafficLight' [a-zA-Z0-9]*; 
GRID_NAME : 'grid' [a-zA-Z0-9]* ;
// Keywords
BOOL : 'true' | 'false' ;
SEMICOLON : ';' ;
METH_NAME : [A-Z][a-zA-Z]* ;
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9];

ID : [a-z]+ LETTER* DIGIT* ;
STRING : '"' [a-zA-Z0-9]+  '"'; 
// Whitespace
WS : [ \t\r\n]+ -> skip ;