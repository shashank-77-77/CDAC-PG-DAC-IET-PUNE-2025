package com.service;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Scanner;
import com.beans.*;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao edao;
	
	

	public EmployeeServiceImpl() {
		super();
		this.edao =new EmployeeDaoImpl();
	}



	@Override
	public void readFile(String fname) {
		edao.readFile(fname);
		
		
	}



	@Override
	public boolean addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter desg");
		String desg=sc.next();
		System.out.println("Enter sal");
		double sal=sc.nextDouble();
		
		Employee e1=new Employee(id,nm,desg,sal);
		return edao.save(e1);
		
	}



	@Override
	public boolean deletebyId(int empid) {
		
		return edao.deletebyId(empid);
	}



	@Override
	public boolean updateById(int id, double sal) {
		return edao.updateById(id,sal);
	}



	@Override
	public List<Employee> getAllData() {
		return edao.getAllData();
	}



	@Override
	public Employee getById(int id) {
		
		return edao.getById(id);
	}



	@Override
	public void writeToFile(String fname) {
		edao.writeToFile(fname);
	
			
		}
		
	}


