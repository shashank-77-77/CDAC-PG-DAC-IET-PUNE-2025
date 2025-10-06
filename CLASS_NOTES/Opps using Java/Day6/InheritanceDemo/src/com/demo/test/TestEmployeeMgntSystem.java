package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeMgntSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. add new Employee\n 2. Display all");
			System.out.println("3. Display by id\n 4. change sal or charges");
			System.out.println("5. Display Salaried Employee\n 6. Display Contract Employee");
			System.out.println("7. Search By Name\n 8. calculate net salary\n9. exit\n Choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1. salaried\n2.Contract\n3.Vendor\n choice: ");
				int ch=sc.nextInt();
				boolean status=EmployeeService.addNewEmployee(ch);
				if(status) {
					System.out.println("added successfully");
					
				}else {
					System.out.println("Error :not added");
				}
				break;
			case 2:
				EmployeeService.displayAll();
				
				break;
			case 3:
				System.out.println("enter Id");
				String id=sc.next();
				Employee e=EmployeeService.searchById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("enter Id");
				id=sc.next();
				System.out.println("enetr new sal/charges");
				double charges=sc.nextDouble();
				status=EmployeeService.modifyById(id,charges);
				if(status) {
					System.out.println("Updated successfully");
				}else {
					System.out.println("not found");
				}
				break;
			case 5:
				EmployeeService.displayOnlySalariedEmp();
				break;
			case 6:
				EmployeeService.displayOnlyContractEmp();
				break;
			case 7:
				break;
						
			case 8:
				break;
			case 9:
				System.out.println("Thank you for visiting......");
				sc.close();
				break;	
			
			default:
				System.out.println("wrong choice");
				break;
			}
		}while(choice!=10);
	}

}
