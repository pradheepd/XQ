

CREATE DEFINER=`root`@`localhost` PROCEDURE `xpcdtnNEQ_and`(in path nvarchar(300), in cnst decimal)
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
		if fbuff = cnst then 
			update ordtable set mtch=1 where idx =idn;
		else update ordtable set mtch=0 where idx =idn;
		end if;
	end if;
until done end repeat;

close fvals;

END