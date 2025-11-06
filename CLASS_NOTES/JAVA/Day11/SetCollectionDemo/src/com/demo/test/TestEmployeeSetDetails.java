package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;







public class TestEmployeeSetDetails {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	EmployeeService eservice=new EmployeeServiceImpl();
	int choice=0;
	do {
		System.out.println("1. add new employee\n 2. display all\n3. search by id");
		System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
		System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status=eservice.addNewEmployee();
			if(status) {
				System.out.println("added succesfully");
			}else{
				System.out.println("duplicate id ,not Added");
			}
		}
		case 2->{
			Set<Employee> eset=eservice.displayAll();
			eset.forEach(System.out::println);
					
				}
		case 3->{
			System.out.println("enter id");
			int id=sc.nextInt();
			Employee e=eservice.displayById(id);
			if(e!=null) {
				System.out.println(e);
			}else {
				System.out.println("not found");
			}
		}
		case 4->{
			System.out.println("enter name");
			String nm=sc.next();
			Set<Employee> eset=eservice.displayByName(nm);
			if(eset!=null) {
				eset.forEach(System.out::println);
			}else {
				System.out.println("not found");
			}
		}
		case 5->{
			System.out.println("enter id");
			int id=sc.nextInt();
			
			System.out.println("enter sal");
			double sal =sc.nextDouble();
			
			boolean status = eservice.updateBySal(id,sal);
			if(status) {
				System.out.println("Updated successfully");
				
			}
			else {
				System.out.println("Not found");
			}
			
			
		}
		case 6->{
			System.out.println("Enter id to Delete");
			int id = sc.nextInt();
			boolean status =eservice.deleteById(id);
			if(status) {
				System.out.println("Deleted successfully");
				
			}
			else {
				System.out.println("Not found");
			}
			
		}
		case 7->{
			System.out.println("enter Salary");
			double sal =sc.nextDouble();
			boolean status =eservice.deleteBySal(sal);
			if(status) {
				System.out.println("Deleted successfully");
				
			}
			else {
				System.out.println("Not found");
			}
			
		}
		case 8->{
			
		}
		case 9->{
			List<Employee> elist=eservice.sortBySal();
			elist.forEach(System.out::println);
			
		}
		case 10->{
			List<Employee> elist=eservice.sortByName();
			//elist.forEach(e->System.out.println(e));
			elist.forEach(System.out::println);
		}
		case 11->{
			Set<Employee> eset=eservice.sortById();
			eset.forEach(System.out::println);
		}
		case 12->{
			sc.close();
			System.out.println("Thank you for visiting.....");
		}
		default->{
			System.out.println("wrong choice");
		}	
		}
	}while(choice!=12);
	
	
}
}
