lexer grammar XQL;

@members{
	int OBCount = 0;
}

HTMS:	['<'];
HTME:	['>'];
SLH: 	['/'];
HOFL:	'{' {pushMode(QRY);};
HCFL:	'}';
HWS  :  [ \t\r\n]+ -> skip ;
HID  :  [a-zA-Z][0-9a-zA-Z_]*;
INHTM:	[\x20-\x3B\x3D\x3F-\x7A\x7C\x7E]+;
HEQ	:	'=';
HLIT	:	'\"' .*? '\"';

mode QRY;

IF	:	'if';
ELSE:	'else';
THEN:	'then';
FOR :	'for';
IN	:	'in';
DCL	:	'declare';
FN	:	'function';
AS	:	'as' | 'AS';
PATH:	'/';
DPATH:	'//';
ORDER:	'order';
BY	:	'by';
AT	:	'at';
WHERE:	'where';
RETURN:	'return';
LET	:	'let';
AND	:	'and';
GT	:	'>' | 'gt';
GE	:	'>=' | 'ge';
LT	:	'<' | 'lt';
LE	:	'<=' | 'le';
EQ	:	'=' | 'eq';
NE	:	'!=' | 'ne';
LEQ	:	':=';
CL	:	':';
OB	:	'(';
CB	:	')';
ATT	:	'@';
OFL	:	'{' {OBCount++;};
CFL	:	'}'	{OBCount--; if(OBCount<0) popMode();};
CMA	:	',';
QM	:	'?';
PL	:	'+';
MN	:	'-';
ML	:	'*';
SBO	:	'[';
SBC	:	']';
DIV	:	'div';
OR	:	'or';
MOD	:	'mod';
DSH	:	'|';
LIT	:	'\"' .*? '\"';
CT	:	'\"';
DOC	:	DC '(\"'ID (ID |'.')*? '\")';
DC	:	'doc';
VR	:	'$';
ID  :   [a-zA-Z][0-9a-zA-Z_]*;
INT :   [0-9]+ ('.' [0-9]+)? ;
WS  :   [ \t\r\n]+ -> skip ;
COMMENT : '/*' .*? '*/' -> skip ;
