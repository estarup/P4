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
			| declaration ; 
method : METH_RETURN_TYPE METH_NAME method_parameter curl_statement  // declare method
			| METH_NAME method_parameter SEMICOLON; // Call method
if_statement : IF  logic_expression curl_statement+ else_statement?; 
while_loop : WHILE logic_expression curl_statement+ ;
create_statement : CREATE (car_statement | carSpawner_statement | trafficLight_statement | grid_statement); // CREATE CAR ; CAR : name, car_curl_sttm?
assignment : declaration ASSIGN expression SEMICOLON;
declaration : NUM_TYPE? ID ;
method_parameter : LPAREN declaration? RPAREN ;
curl_statement : LCURL statement* RCURL ;
logic_expression : LPAREN condition RPAREN; 
else_statement : ELSE curl_statement+;
car_statement: CAR CAR_NAME curl_statement;
carSpawner_statement : CARSPAWNER CARSPAWNER_NAME curl_statement; 
trafficLight_statement : TRAFFICLIGHT TRAFFICLIGHT_NAME curl_statement;
grid_statement : GRID GRID_NAME curl_statement; 
expression :  term ((ADD | SUBTRACT ) term)?
			| BOOL ;
condition :   expression ((EQUAL | NOTEQUAL | LESSTHAN | MORETHAN | MOREOREQUAL | LESSOREQUAL) term)?
			| BOOL ;
term : factor (( MULTIPLY | DIVIDE ) factor)? ;
factor : LPAREN expression* RPAREN 
		| INTEGER
	    | ID;


// Lexer rules // 

// Literals
METH_RETURN_TYPE : VOID | 'Int' | 'Float' ;
NUM_TYPE : 'int' | 'float' ;
INTEGER : [0]| ('-')? [1-9][0-9]* ;
FLOAT : INTEGER '.'[0-9]* ;

// Operators 0
//MATH_OPERATOR : '+' | '-' | '*' | '/' | '=' | '(' | ')' ;
ADD : '+' ;
SUBTRACT : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;
ASSIGN : '=' ;
LPAREN : '(' ;
RPAREN : ')' ;
// Logic operators
//LOGIC_OP : EQUAL | NOTEQUAL | LESSTHAN | MORETHAN ;
EQUAL : '==' ;
NOTEQUAL : '!=' ;
LESSTHAN : '<' ; 
MORETHAN : '>' ;
LESSOREQUAL : '<=' ;
MOREOREQUAL : '>=' ;

// Brackets
LCURL : '{'  ;
RCURL : '}'  ;


// TEST 
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
VOID : 'void' ;
CREATE : 'create' ;
START : 'Start()' ;
CAR :  'Car' {System.out.println("matched rule car");} ; 
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