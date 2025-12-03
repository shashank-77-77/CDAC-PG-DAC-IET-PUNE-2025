package com.test;

import java.util.List;
import java.util.Scanner;

import com.beans.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;
import com.service.ProjectService;
import com.service.ProjectServiceImpl;

public class TestEmployeeCURD {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProjectService pservice=new ProjectServiceImpl();
		EmployeeService eservice =new EmployeeServiceImpl();
		
		int choice=0;
		do
		{
			System.out.println("1. Add project");
			System.out.println("2. Add Employee");
			System.out.println("3. Show all employees");
			System.out.println("4. Delete employee");
			System.out.println("5. Update Employees Salary");
			System.out.println("6. Exit");
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1->{
				pservice.addNewProject();
			}
			
			case 2->{
				boolean status=eservice.addNewEmployee();
				if(status)
				{
					System.out.println("employee added successfully");
				}
				else
				{
					System.out.println("not added");
				}
			}
			case 3->{
				List<Employee> elist =eservice.getAllEmployee();
				elist.stream().forEach(System.out::println);
			}
			
			case 4->{
				System.out.println("Enter Employee ID to delete");
				int empid=sc.nextInt();
				boolean status=eservice.deleteById(empid);
				if(status)
				{
					System.out.println("Employee Deleted Successfully");
				}
				else
				{
					System.out.println("Not Deleted");
				}
			}
			
			case 5->{
				System.out.println("Enter Employee id to update");
				int empid=sc.nextInt();
				System.out.println("Enter new salary");
				double sal=sc.nextDouble();
				System.out.println("Enter new name");
				String name=sc.next();
				boolean status=eservice.UpdateEmpById(empid,name,sal);
				if(status)
				{
					System.out.println("Employee updated successfully");
				}
				else
				{
					System.out.println("not updated");
				}
			}
			
			}
		}while(choice != 6);
	}

}
