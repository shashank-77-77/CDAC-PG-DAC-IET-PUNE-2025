package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.beans.Project;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.ProjectDao;
import com.demo.dao.ProjectDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
   private EmployeeDao edao;
   private ProjectDao pdao;

public EmployeeServiceImpl() {
	super();
	this.edao = new EmployeeDaoImpl();
	this.pdao=new ProjectDaoImpl();
}

@Override
public boolean addNewEmployee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr new Id");
	int eid=sc.nextInt();
	System.out.println("enetr name");
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

@Override
public List<Employee> getAllEmployee() {
	return edao.findAllEmployee();
}

@Override
public boolean deleteById(int empid) {
	return edao.removeById(empid);
}

@Override
public boolean updateEmployeeById(int empid, String name, double sal) {
	return edao.modifyEmployeeById(empid,name,sal);
}

@Override
public void closeMySessionFactory() {
	edao.closeMySessionFactory();
	
}

@Override
public boolean addProjectToEmployee(int eid, int pid) {
	Employee e=edao.findById(eid);
	Project p=pdao.findById(pid);
	if(e!=null && p!=null) {
		return edao.addextraProjectToEmployee(e,p);
	}
	return false;
}

@Override
public List<Employee> SortEmployeeBySalary() {
	  return edao.sortBySalary();
}
   
}
