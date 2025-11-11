-- drop procedure if exists pro1;
-- delimiter $
-- create procedure pro1()
-- BEGIN
-- 	select "Hello World " R1;
-- end $
-- delimiter ;

-- drop procedure if exists pro1;
-- delimiter $
-- create procedure pro1()
-- BEGIN
-- 	select * from dept;
-- end $
-- delimiter ;

-- drop procedure if exists pro1;
-- delimiter $
-- create procedure pro1()
-- BEGIN
-- 	declare x int default 100;
--     declare y int;
--     set y := 200;
--     select x + y;
-- end $
-- delimiter ;

-- drop procedure if exists pro1;
-- delimiter $
-- create procedure pro1(in x int, in y int,out z int)
-- BEGIN
-- 	set z:= x+y;
--     select z;
-- end $
-- delimiter ;

drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int, in y int,out z int)
BEGIN
	set z:= x+y;
    select z;
end $
delimiter ;