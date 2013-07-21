-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertnode`(pid int,pin int,qname nvarchar(300),xpath nvarchar(300),val nvarchar(300))
BEGIN
	declare inid int;

	insert into ordtable values(default,pid,pin,qname);
	select idx from ordtable order by idx desc limit 1 into inid;
	insert into valtable values(xpath,inid,val);

	select inid;
END