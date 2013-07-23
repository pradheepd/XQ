-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getchilds`(in pathid int,out res nvarchar(1000) )
BEGIN

declare retVal nvarchar(1000);

declare field nvarchar(300);

declare inxml nvarchar(1000);

declare atnam nvarchar(300);

declare atval nvarchar(300);

declare done int default 0;

declare childid int default 0;

declare childs cursor for select idx from ordtable where pid= pathid and mtch= 0 order by pin asc;

declare ats cursor for select nam,val from attable where id=pathid;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

select val from ordtable where idx=pathid into field;

select concat('<',field) into retVal;

open ats;

repeat
	fetch ats into atnam,atval;
	IF NOT done THEN
	insert into debug values(pathid);
	select concat(retVal,' ',atnam,'="',atval,'"') into retVal;
	end if;
until done end repeat;

close ats;

select concat(retVal,'>') into retVal;

select val from valtable where id = pathid limit 1 into inxml;

select concat(retVal,inxml) into retVal;

set done = 0;

open childs;

repeat
	fetch childs into childid;
	IF NOT done THEN
	call getchilds(childid,@rtn);
	select concat(retVal,@rtn) into retVal;
	end if;
until done end repeat;

close childs;

select concat(retVal,'</',field,'>') into retVal;

set res = retVal;

END