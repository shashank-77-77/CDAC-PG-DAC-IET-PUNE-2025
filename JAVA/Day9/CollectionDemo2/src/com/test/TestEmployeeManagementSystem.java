package com.test;


import java.util.List;
import java.util.Scanner;

import com.beans.*;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class TestEmployeeManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new employee\n2. display all\n3. search by id");
			System.out.println("4. Search by name\n5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n9. sort by salary\n10. Search1 by name\n11. Delete By Name \n12. Sort By Name\n13. Exit choice: ");
			choice=sc.nextInt();
								
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("added successfully");
				}else {
					System.out.println("not found");
				}
			}
			case 2->{
				List<Employee> elist=eservice.displayAll();
				//display data
				elist.forEach(System.out::println);
			}
			case 3->{
				System.out.println("Enter id for search");
				int eid=sc.nextInt();
				Employee e=eservice.searchById(eid);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			case 4->{
				System.out.println("Enter name for searching");
				String nm=sc.next();
				List<Employee> elst=eservice.findByName(nm);
				if(elst!=null) {
					elst.forEach(System.out::println);
				}else{
					System.out.println("not found");
				}
			}
			case 5->{
				System.out.println("Enter id to search");
				int eid=sc.nextInt();
				System.out.println("Enter salary to update");
				double sal=sc.nextDouble();
				boolean status = eservice.updateSal(eid,sal);
			}
			case 6->{
				System.out.println("Enter id for delete");
				int eid=sc.nextInt();
				boolean status=eservice.deleteById(eid);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
			}
			case 7->{
				System.out.println("Enter sal to delete");
				double sal=sc.nextDouble();
				boolean status= eservice.deleteBySal(sal);
				if(status)
				{
					System.out.println("Deleted successfully");
				}
				else
				{
					System.out.println("Not found");
				}
			}
			case 8->{
				System.out.println("Enter sal to search");
				double sal=sc.nextDouble();
				List <Employee> lit=eservice.findBySal(sal);
				if(lit != null)
				{
					lit.forEach(System.out :: println);
				}else
				{
					System.out.println("Not Found");
				}
			}
			
			case 9->{
				List <Employee> lst=eservice.sortBySal();
				lst.forEach(System.out :: println);
			}
			
			case 10->{
				System.out.println("Enter name to search");
				String s1=sc.next();
				List <Employee> lsr=eservice.searchByName(s1);
				if(lsr !=null)
				{
				lsr.forEach(System.out ::println);
				}
				else
				{
					System.out.println("Not Found");
				}
			}
			case 11->{
				System.out.println("Enter name to delete");
				String n1=sc.next();
				boolean status=eservice.deleteByName(n1);
				if(status)
				{
					System.out.println("Deleted Successfully");
				}
				else
				{
					System.out.println("Not Found");
				}
			}
			case 12->{
				
			}
				
			case 13->{sc.close();
			     System.out.println("Thank you for visiting...."); 
			}
			default->{
				System.out.println("wrong choice");
			}
			}
			
		}while(choice!=13);

	}

}
