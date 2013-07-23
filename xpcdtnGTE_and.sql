-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `xpcdtnGTE_and`(in path nvarchar(300), in cnst decimal)
BEGIN

declare done int default 0;

declare idn int default 0;

declare fbuff decimal default 0;

declare fvals cursor for select cast(val as decimal(5,3)), id from valtable where xp = path;

open fvals;

repeat
	fetch fvals into fbuff, idn;
	if not done then
	select pid from ordtable where idx=idn;
		if fbuff < cnst then 
			update ordtable set mtch=1 where id =idn; 
		else update ordtable set mtch=0 where id =idn; 
		end if;
	end if;
until done end repeat;

close fvals;

END