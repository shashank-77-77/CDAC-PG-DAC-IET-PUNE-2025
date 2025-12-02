package com.test;

import java.util.Scanner;


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
			}
		}while(choice != 6);
	}

}
