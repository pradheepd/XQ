CREATE PROCEDURE `xquery`.`xpathat` (in path nvarchar(1000),in inam nvarchar(100))
BEGIN

 select val from attable where xp=path and nam=inam;

END