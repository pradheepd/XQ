CREATE DEFINER=`root`@`localhost` PROCEDURE `getchild`(in pathid int,out res nvarchar(1000) )
BEGIN

 declare retVal nvarchar(1000);

declare done int default 0;

declare childid int default 0;

declare childs cursor for select idx from ordtable where pid= pathid and mtch=0 order by pin asc;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

select val from valtable where id = pathid limit 1 into retVal;

set retVal = ifnull(retVal,'');

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

set res = retVal;

END