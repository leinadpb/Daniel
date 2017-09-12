grammar Daniel;

program : statement+ ;

//Statements
statement : assign | print | function | additionExp | condicional | mientras ;

//Mientras
mientras : 'mientras' '(' argumentIf ')' '{' statement* '}' ;

//Condicionales
condicional : 'si' '(' argumentIf ')' '{' statement* '}' ( 'sino si' '(' argumentIf ')' '{' statement* '}' )* ( 'sino' '{' statement+ '}' )? ;

argumentIf : ( (ID | NUMERO) COMPARACION (ID | NUMERO) | ID '==' BOOLEANO | BOOLEANO ) ;

//Function declaration
function : privacy functionType ID '(' argumentFunc ')' '{' statement+ '}' ;

privacy : 'publico' | 'privado' | 'protegido' ; //Privacy
functionType : 'vacio' | dataTypes; //Function type
argumentFunc : (dataTypes ID | dataTypes ID ',' argumentFunc) ; //Arguments of a function
dataTypes : 'cadena' | 'entero' | 'decimal' | 'booleano' ; //Data types

//Assign declaration
assign : ID '=' (additionExp | ID) ;
//Print declaration
print : 'imprimir' (additionExp | ID) ;

//Basic operations
additionExp : multiplyExp ('+' multiplyExp | '-' multiplyExp)* ;
multiplyExp : atomExp ('*' atomExp | '/' atomExp)* ;
atomExp : NUMERO | '(' additionExp ')' ;

//Basic declarations
ID : MAY | MIN | MAY ID | MIN ID ;
MAY : [A-Z] ;
MIN : [a-z] ;
NUMERO : [-]? [0-9]+ ( '.' [0-9]+ )? ;
COMPARACION : ('<' | '>' | '==' | '<=' | '>=') ;
BOOLEANO : 'verdadero' | 'falso'  ;

//Ignore user readable characters
WS : (' ' |'\t' | '\r' | '\n' )+ -> channel(HIDDEN) ;