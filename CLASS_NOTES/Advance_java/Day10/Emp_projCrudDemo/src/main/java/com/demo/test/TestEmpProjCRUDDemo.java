package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.ProjectService;
import com.demo.service.ProjectServiceImpl;

public class TestEmpProjCRUDDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProjectService pservice=new ProjectServiceImpl();
		EmployeeService eservice=new EmployeeServiceImpl();
		
		int choice=0;
		do {
			System.out.println("1. Add project");
			System.out.println("2. Add Employees");
		    System.out.println("3. show all employees");
		    System.out.println("4. delete employee");
			System.out.println("5. update Employees salary");
		    System.out.println("6. exit\nchoice:");
		    choice=sc.nextInt();
		    switch(choice) {
		    case 1->{
		    	pservice.addNewProject();
		    }
		    case 2->{
		    	boolean status=eservice.addNewEmployee();
		    	if(status) {
		    		System.out.println("employee added successfully");
		    	}else {
		    		System.out.println("Not added");
		    	}
		    }
		    	
		    }
		    
		}while(choice!=6);

	}

}
