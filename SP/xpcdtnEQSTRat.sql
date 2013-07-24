
CREATE DEFINER=`root`@`localhost` PROCEDURE `xpcdtnEQSTRat`(in path nvarchar(300),in inam nvarchar(100),in cnst nvarchar(300))
BEGIN

 declare done int default 0;

declare buff nvarchar(300);

declare idn int default 0;

declare vals cursor for select val, id from attable where xp = path and nam =inam;

open vals;

repeat
	fetch vals into buff, idn;
	if not done then
		if buff != cnst then 
			update ordtable set mtch=1 where idx =idn; 
		end if;
	end if;
until done end repeat;

close vals;

END