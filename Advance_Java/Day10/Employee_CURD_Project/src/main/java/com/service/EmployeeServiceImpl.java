package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.beans.Employee;
import com.beans.Project;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.dao.ProjectDao;

public class EmployeeServiceImpl implements EmployeeService {
	
	   private EmployeeDao edao;
	   private ProjectDao pdao;


public EmployeeServiceImpl() {

	this.edao = new EmployeeDaoImpl();
}


@Override
public boolean addNewEmployee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Empid");
	int eid=sc.nextInt();
	System.out.println("Enter name");
	String ename=sc.next();
	System.out.println("Enter Hiredate(dd/mm/yyyy");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println("Enter Salary");
	double sal=sc.nextDouble();
	System.out.println("Enter project id");
	String pid=sc.next();
	String[] parr=pid.split(",");
	Set<Project> pset=pdao.findByPid(parr);
	Employee e= new Employee(eid,ename,ldt,sal,pset);
	return edao.save(e);
	
}

}
