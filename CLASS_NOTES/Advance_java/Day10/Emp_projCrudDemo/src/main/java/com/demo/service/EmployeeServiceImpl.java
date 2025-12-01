package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;

public class EmployeeServiceImpl implements EmployeeService{
   private EmployeeDao edao;
   private ProjectDao pdao;

public EmployeeServiceImpl() {
	super();
	this.edao = new EmployeeDaoImpl();
}

@Override
public boolean addNewEmployee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr new Id");
	int eid=sc.nextInt();
	String ename=sc.next();
	System.out.println("enter hiredate(dd/MM/yyyy)");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println("enter salary");
	double s=sc.nextDouble();
	System.out.println("enetr project id");
	String pid=sc.next();
	String[] parr=pid.split(",");
	Set<Project> pset=pdao.findByPid(parr);
	Employee e=new Employee(eid,ename,ldt,s,pset);
	return edao.save(e);
	
}
   
}
