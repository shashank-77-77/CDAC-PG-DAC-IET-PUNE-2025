package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpt;

public class EmployeeServiceImpt implements EmployeeService {
	private EmployeeDao edao;

	public EmployeeServiceImpt() {
		super();
		this.edao = new EmployeeDaoImpt();
	}


	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empid");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String ename=sc.next();
		System.out.println("Enter sal");
		double sal=sc.nextDouble();
		System.out.println("Enter joining date (dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate jdt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=new Employee(id,ename,sal,jdt);
		
		return edao.save(e);
	}


	@Override
	public Set<Employee> displayAll() {
		
		return edao.displayAll();
	}


	@Override
	public Employee searchById(int id) {
		
		return edao.searchById(id);
	}


	@Override
	public Set<Employee> searchByName(String nm) {
		
		return edao.searchByName(nm);
	}


	@Override
	public boolean updateSal(int id, double sal) {
	
		return edao.updateSal(id,sal);
	}


	@Override
	public boolean deleteById(int id) {
	
		return edao.deleteById(id);
	}


	@Override
	public boolean deleteBySal(double sal) {
		
		return edao.deleteBySal(sal);
	}


	@Override
	public Set<Employee> sortById() {
		return edao.sortById();
	}


	@Override
	public List<Employee> sortBySal() {
		return edao.sortBySal();
	}


	@Override
	public List<Employee> sortByName() {
		
		return edao.sortByName();
	}




	
	

}
