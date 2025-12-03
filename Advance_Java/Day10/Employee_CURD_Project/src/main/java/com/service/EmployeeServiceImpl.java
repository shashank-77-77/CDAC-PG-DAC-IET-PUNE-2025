package com.service;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.beans.Employee;
import com.beans.Project;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.dao.ProjectDao;
import com.dao.ProjectDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	   private EmployeeDao edao;
	   private ProjectDao pdao;


public EmployeeServiceImpl() {

	this.edao = new EmployeeDaoImpl();
	this.pdao=new ProjectDaoImpl();
}


@Override
public boolean addNewEmployee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter new Id");
	int eid=sc.nextInt();
	System.out.println("Enter name");
	String ename=sc.next();
	System.out.println("Enter hiredate(dd/MM/yyyy)");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println("Enter salary");
	double s=sc.nextDouble();
	System.out.println("Enter project id");
	String pid=sc.next();
	String[] parr=pid.split(",");
	Set<Project> pset=pdao.findByPid(parr);
	Employee e=new Employee(eid,ename,ldt,s,pset);
	return edao.save(e);
	
}


@Override
public List<Employee> getAllEmployee() {
	return edao.findAllEmployee();
}


@Override
public boolean deleteById(int empid) {
	return edao.removeById(empid);
}


@Override
public boolean UpdateEmpById(int empid, String name, double sal) {
	return edao.modifyEmployeeById(empid,name,sal);
}

}
