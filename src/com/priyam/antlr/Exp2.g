grammar Exp2;
options{
language= Java;
output= AST;
ASTLabelType= CommonTree;

}
@header{
package com.priyam.antlr;
}
@lexer::header{
  package com.priyam.antlr;
}

eval
    :    additionExp EOF!
    ;

additionExp
    :    multiplyExp 
         ( '+'^ multiplyExp 
         | '-'^ multiplyExp
         )* 
    ;

multiplyExp
    :    atomExp
         ( '*'^ atomExp 
         | '/'^ atomExp
         )* 
    ;

atomExp
    :    Number
    |    '('! additionExp ')'!
    ;

Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;

WS  
    :   (' ' | '\t' | '\r'| '\n') {$channel=HIDDEN;}
    ;
