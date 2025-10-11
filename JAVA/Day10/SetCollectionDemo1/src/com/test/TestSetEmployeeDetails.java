package com.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.beans.Employee;
import com.service.*;
public class TestSetEmployeeDetails {

	public static void main(String[] args) 

{
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpt();
		int choice=0;
		
		do {
			System.out.println("1. add new employee\n2. display all\n3. search by id");
			System.out.println("4. Search by name\n5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("\n8. sort by id");
			System.out.println("9. Sort By Salary\n10. Sort By Name\n11. exit\n choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("Added New Employee Successfully");
				} else {
					System.out.println("Error : Employee Not Added");
				}
				break;
			}
				
			case 2->{
					Set<Employee> eset =eservice.displayAll();
					eset.forEach(System.out :: println);
					break;
				}
			case 3->{
					System.out.println("Enter id to search");
					int id=sc.nextInt();
					Employee e=eservice.searchById(id);
					if(e != null)
				{
					System.out.println(e);
				}
				else
				{
					System.out.println("not found");
				}
				break;
				}	
			case 4->{
				System.out.println("Enter name to search");
				String nm=sc.next();
				Set<Employee> elist=eservice.searchByName(nm);
				if(elist != null)
				{
					elist.forEach(System.out::println);
				}else
				{
					System.out.println("Not Found");
				}
				break;
				}
			
			case 5->{
				System.out.println("Enter id ");
				int id=sc.nextInt();
				System.out.println("Enter sal ");
				double sal=sc.nextDouble();
				
				boolean status =eservice.updateSal(id,sal);
				if(status)
				{
					System.out.println("salaray updated successfully");
				}
				else
				{
					System.out.println("Not updated successfully");
				}
				break;
			}
				
			case 6 -> {
				
				System.out.println("Enter ID to Delete");
				int id= sc.nextInt();
				boolean status = eservice.deleteById(id);
				if(status)
				{
					System.out.println("Data Deleted Successfully");
				}
				else {
					
					System.out.println("Error : Not Deleted ");
				}
			}
			
			case 7->{
				System.out.println("Enter sal to delete");
				double sal=sc.nextDouble();
				boolean status=eservice.deleteBySal(sal);
				if(status)
				{
					System.out.println("Deleted successfully");
				}
				else
				{
					System.out.println("Not Deleted");
				}
				break;
			}
			
			case 8->{
				Set <Employee> lst=eservice.sortById();
				lst.forEach(System.out::println);
				break;
			}
			
			case 9->{
				List<Employee> elist=eservice.sortBySal();
				elist.forEach(System.out::println);
				break;
			}
			
			case 10->{
				List<Employee> elist=eservice.sortByName();
				elist.forEach(System.out::println);
				break;
			}
			
			case 11->{
				System.out.println("thanks for visiting.........");
				break;
			}
			
			default ->{
				System.out.println("Wrong choice");
			}
			
		}
	}while(choice != 11);
}}	
		
