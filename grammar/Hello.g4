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
			| declaration
			| print
			;
method :     method_init
            | method_call;
method_init: method_declaration method_parameter_init curl_statement;
method_call: METH_NAME method_parameter_call SEMICOLON;
method_declaration: METH_RETURN_TYPE METH_NAME;
if_statement : IF  logic_expression curl_statement else_statement? ;
while_loop : WHILE logic_expression curl_statement ;
create_statement : CREATE create_type ID constructor SEMICOLON;
constructor: LPAREN DOUBLE ',' DOUBLE ',' STRING ',' INTEGER RPAREN // Carspawner
           | LPAREN DOUBLE ',' DOUBLE ',' INTEGER RPAREN; // TrafficLight
create_type : CARSPAWNER
            | TRAFFICLIGHT
            ;
assignment : ID ASSIGN expression SEMICOLON
           | ID ASSIGN STRING SEMICOLON;
declaration : VAR_TYPE ID SEMICOLON;
print: PRINT LPAREN STRING RPAREN SEMICOLON;
method_parameter_init : LPAREN declaration? RPAREN;
method_parameter_call : LPAREN RPAREN
                      | LPAREN ID RPAREN
                      | LPAREN INTEGER RPAREN
                      | LPAREN DOUBLE RPAREN;
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
		|  DOUBLE
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
RETURN : 'return';
CAR :  'Car';
CARSPAWNER: 'CarSpawner' ;
TRAFFICLIGHT : 'TrafficLight'; 
BOOL : 'true' | 'false' ;
PRINT : 'Print';

// Literals
METH_RETURN_TYPE : 'void' | 'Int' | 'Double' ;
VAR_TYPE : 'int' | 'double' | 'string';
INTEGER : [0]| [1-9][0-9]* ;
DOUBLE : INTEGER ('.')? [0-9]* ;
METH_NAME : [A-Z][a-zA-Z]* ;
ID : [a-z]+ LETTER* DIGIT* ;
STRING : '"' [a-zA-Z0-9 \t\r]+ '"';
fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9];
// Whitespace
WS : [ \t\r\n]+  -> skip ;