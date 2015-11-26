grammar LeftRecursion;

@header {
package org.sourcepit.lr;
}

stat
    : expr[0] ';'
    ;

expr[int pr]
    : {pr == 0}? multi[pr+1]
    | {pr == 0}? plus[pr+1]
    | INT
    | ID
    ;

multi[int pr]
    : expr[pr] '*' expr[pr]
    ;

plus[int pr]
    : expr[pr] '+' expr[pr]
    ;

INT
    : '1' .. '9' ( '0' .. '9' )*
    ;

ID
    : ( 'a' .. 'z' )+
    ;