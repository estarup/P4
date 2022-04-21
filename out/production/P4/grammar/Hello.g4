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
method :      METH_RETURN_TYPE METH_NAME method_parameter curl_statement
			| METH_NAME method_parameter SEMICOLON
			;
if_statement : IF  logic_expression curl_statement else_statement? ;
while_loop : WHILE logic_expression curl_statement ;
create_statement : CREATE create_type ID curl_statement;
create_type : CAR
            | CARSPAWNER
            | TRAFFICLIGHT
            | GRID ;
assignment : ID ASSIGN expression SEMICOLON;
declaration : NUM_TYPE ID ;
method_parameter : LPAREN declaration? RPAREN ;
curl_statement : LCURL statement* return_statement? RCURL ;
return_statement : RETURN ID SEMICOLON;
logic_expression : LPAREN condition RPAREN; 
else_statement : ELSE curl_statement;
expression :  add_expression
            | subtract_expression
            | term
            ;
add_expression :  term ADD expression;
subtract_expression : term SUBTRACT expression;
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

term :   multiply_term
       | divide_term
       | factor;
multiply_term : factor MULTIPLY term;
divide_term : factor DIVIDE term;
factor : LPAREN expression RPAREN
		|  INTEGER
		|  FLOAT
	    |  ID
	    | negative_factor
	    ;
negative_factor : SUBTRACT factor;
// Lexer rules // 



// Operators
ADD : '+' ;
SUBTRACT : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
ASSIGN : '=' ;
SEMICOLON : ';' ;

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

// Keywords
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
CREATE : 'create' ;
START : 'Start' ;
RETURN : 'return';
CAR :  'Car';
CARSPAWNER: 'CarSpawner' ;
TRAFFICLIGHT : 'TrafficLight'; 
GRID : 'Grid' ;
CARSPAWNER_NAME : 'carSpawner' [a-zA-Z0-9]*;
TRAFFICLIGHT_NAME : 'trafficLight' [a-zA-Z0-9]*; 
GRID_NAME : 'grid' [a-zA-Z0-9]* ;
BOOL : 'true' | 'false' ;

// Literals
METH_RETURN_TYPE : 'void' | 'Int' | 'Float' ;
NUM_TYPE : 'int' | 'float' ;
INTEGER : [0]| [1-9][0-9]* ;
FLOAT : INTEGER '.'[0-9]* ;
METH_NAME : [A-Z][a-zA-Z]* ;


ID : [a-z]+ LETTER* DIGIT* ;
STRING : '"' [a-zA-Z0-9]+  '"';
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9];
// Whitespace
WS : [ \t\r\n]+ -> skip ;