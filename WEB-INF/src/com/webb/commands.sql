use xquery;

-- call getchilds(2,@rtn);select @rtn;

create database xquery;

create table debug (val nvarchar(300));

delete from debug;

drop table debug;

drop table result;

select * from debug;

delete from attable;

call xpath('doc("sample.xml")/bookstore/book');

drop table ordtable;

drop table valtable;

drop table attable;

create table attable(id int,xp nvarchar(1000),nam nvarchar(300),val nvarchar(300), index(id),index hash(xp));

create table ordtable(idx int AUTO_INCREMENT,pid int,pin int,val nvarchar(1000),mtch bit default 0,primary key(idx));

create table valtable(xp nvarchar(1000),id int,val nvarchar(1000), key hash(xp));

select * from ordtable;

select * from valtable;

select * from attable;

call xpcdtnEQSTRat('doc("sample.xml")/bookstore/book','category','WEB');

update ordtable set mtch=0;

lock tables ordtable read, valtable read, attable read;
unlock tables;