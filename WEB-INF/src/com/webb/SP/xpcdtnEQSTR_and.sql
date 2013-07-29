

CREATE DEFINER=`root`@`localhost` PROCEDURE `xpcdtnEQSTR_and`(in path nvarchar(300),in cnst nvarchar(300))
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
		if buff != cnst then 
			update ordtable set mtch=1 where idx =idn; 
		else update ordtable set mtch=0 where idx =idn; 
		end if;
	end if;
until done end repeat;

close vals;

END