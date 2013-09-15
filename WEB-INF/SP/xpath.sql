
CREATE DEFINER=`root`@`localhost` PROCEDURE `xpath`(IN xpath nVARCHAR(300))
BEGIN

 declare pathid int default 0;

declare done int default 0;

declare childs cursor for select ID from valtable where xp like xpath;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

create temporary table result(records nvarchar(1000));

set max_sp_recursion_depth = 1000;

open childs;

repeat
	 fetch childs into pathid;
	 IF NOT done THEN
		if (select mtch from ordtable where idx=pathid) = 0 then
			call getchild(pathid,@rtn);
			insert into result values(@rtn);
		end if;
	 END IF;

until done end repeat;

close childs;

select * from result;

drop table result;

END