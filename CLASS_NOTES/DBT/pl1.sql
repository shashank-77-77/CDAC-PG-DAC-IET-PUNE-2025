/*drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	select "Hello World " R1;
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	select * from dept;
end $
delimiter ;



drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	insert into i values(1,1,1);
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare x int default 100;
	declare y int;
	set y := 200;
	select x+y;
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1(x int, y int)
BEGIN
	select x+y;
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int, in y int,  out z int)
BEGIN
	set z := x+y;
end $
delimiter ;



drop procedure if exists pro1;
delimiter $
create procedure pro1(in x int, in y int,  out z int,  out z1 int)
BEGIN
	set z := x+y;
	set z1 := x*y;
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare exit handler for sqlexception
	BEGIN
	    ROLLBACK;
		SELECT 'Transaction failed. Rolled back.' AS message;
	end;
	Start Transaction Read Write;

	insert into a1 values(2);
	insert into a2 values(2);
	commit;
	
end $
delimiter ;



drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	
	insert into dept values(81, 'PQR', 'baroda','xyz', '24/03/1989',-1);
end $
delimiter ;




drop procedure if exists pro1;
delimiter $
create procedure pro1(p_dname varchar(20), p_loc varchar(20), p_pwd varchar(20), p_STARTEDON varchar(20) )
BEGIN
	declare v_deptno int default 0;
	select max(deptno) + 1 into v_deptno from dept;
	insert into dept values(v_deptno, upper(p_dname),  upper(p_loc) , p_pwd, p_STARTEDON);
	select  "Record inserted ....." as Message;
end $
delimiter ;


  call pro1('marketing', 'baroda','saleel', '22/12/1989')

drop procedure if exists pro1;
delimiter $
create procedure pro1(p_deptno int)
BEGIN
	delete from dept where deptno = p_deptno;
	select  "Record deleted ....." as Message;
end $
delimiter ;



drop procedure if exists pro1;
delimiter $
create procedure pro1(p_deptno int)
BEGIN
	declare flag bool default false;
	 
	 select	true into flag from dept where deptno =  p_deptno;
	 
	 if flag THEN
		delete from dept where deptno =  p_deptno;
		select "Record deleted ..." as MSG;
	 ELSE
			select "Record not found..." as MSG;
	 end if;
end $
delimiter ;




drop procedure if exists pro1;
delimiter $
create procedure pro1(x int, y int)
BEGIN
	
	select * from dept limit x, y;
	
end $
delimiter ;



drop procedure if exists pro1;
delimiter $
create procedure pro1(p_last_record int)
BEGIN
	declare v_cnt int default 0;
	
	select count(*) - p_last_record  into v_cnt from dept;
	
	select * from dept limit v_cnt, p_last_record;
	
end $
delimiter ;



drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare x int;
	set x := 1;
	
	lbl1:LOOP
		
		select x;
		set x := x + 1;
		
		if x >=10 THEN
			leave lbl1;
		end if;
		
	end loop lbl1;
	
	
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	declare x int default 1; 
	
	lbl1:LOOP
		
		select x;
		set x := x + 1;
		
		if x >10 THEN
			leave lbl1;
		end if;
		
		insert into t values(curdate() + interval x day);
	end loop lbl1;

end $
delimiter ;




drop procedure if exists pro1;
delimiter $
create procedure pro1()
b1:BEGIN
	declare exit handler for  1062 select 'present ..';
	insert into a1 values(1,1); 	
end b1$
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1()
b1:BEGIN
	declare exit handler for sqlexception
	b2:begin
		rollback;
		select 'Transaction undon...';
	end b2;

	start transaction read write;
	
	insert into a1 values(4,'shanchali'); 
	insert into a2 values(2,'bharuch'); 

	commit;
	select	'Trainaction done';
	
end b1$
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1()
b1:BEGIN
	declare v_deptno int;
	declare v_dname, v_loc, v_pwd, v_startedon varchar(20);
	
	declare c1 cursor for select * from dept;
	
	declare exit handler for 1329 select 'done';
	open c1;
	lbl:loop
		fetch c1 into v_deptno, v_dname, v_loc, v_pwd, v_startedon;
		select v_deptno, v_dname, v_loc, v_pwd, v_startedon;
	end loop lbl;
	close c1;
end b1$
delimiter ;
*/

drop procedure if exists pro1;
delimiter $
create procedure pro1()
b1:BEGIN
	declare v_deptno int;
	declare v_name, v_job varchar(20);
	
	declare c1 cursor for  select ename, job, deptno from emp;
	
	declare exit handler for 1329 select 'done';
	open c1;
	lbl:loop
		fetch c1 into v_name, v_job , v_deptno;
		if v_deptno = 10 THEN
			insert into e1 values(v_name, v_job , v_deptno);
		elseif v_deptno = 20 THEN
			insert into e2 values(v_name, v_job , v_deptno);
		ELSE
			insert into e3 values(v_name, v_job , v_deptno);
		end if;
		
	end loop lbl;
	close c1;
end b1$
delimiter ;


























