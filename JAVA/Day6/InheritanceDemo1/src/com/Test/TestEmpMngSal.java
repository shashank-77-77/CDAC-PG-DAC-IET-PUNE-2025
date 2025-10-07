package com.Test;
import com.Beans.*;

import java.util.Scanner;

import com.Service.EmpService;



		public class TestEmpMngSal {

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
					boolean status=EmpService.addNewEmployee(ch);
					if(status) {
						System.out.println("added successfully");
						
					}else {
						System.out.println("Error :not added");
					}
					break;
				case 2:
					EmpService.displayAll();
					
					break;
				case 3:
					System.out.println("enter Id");
					String id=sc.next();
					Employee e=EmpService.searchById(id);
					if(e!=null) {
						System.out.println(e);
					}else {
						System.out.println("not found");
					}
					break;
				case 4:
					System.out.println("enter Id");
					id=sc.next();
					System.out.println("enter new sal/charges");
					double charges=sc.nextDouble();
					status=EmpService.modifyById(id,charges);
					if(status) {
						System.out.println("Updated successfully");
					}else {
						System.out.println("not found");
					}
					break;
				case 5:
					EmpService.displayOnlySalariedEmp();
					
					break;
				case 6:
					EmpService.displayOnlyContractEmp();
					break;
				case 7:
					System.out.println("Enter name to search");
					String s1=sc.next();
					e=EmpService.searchByName(s1);
					if(e!=null)
					{
						System.out.println(e);
					}
					else
					{
						System.out.println("Not Found");
					}
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


