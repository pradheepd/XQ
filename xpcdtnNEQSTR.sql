-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `xpcdtnNEQSTR`(path nvarchar(300), cnst nvarchar(300))
BEGIN

declare done int default 0;

declare buff nvarchar(300);

declare idn int default 0;

declare vals cursor for select val, id from valtable where xp = path;

open vals;

repeat
	fetch vals into buff, idn;
	if not done then
	select pid from ordtable where idx=idn;  
		if buff = cnst then 
			update ordtable set mtch=1 where id =idn;
		end if;
	end if;
until done end repeat;

close vals;

END