package com.test;
import java.util.List;
import java.util.Scanner;

import com.beans.Employee;
import com.service.*;
public class TestCurdDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		eservice.readFile("empdata1.txt");
		int choice = 0;
		do {
			System.out.println("1. Add new Employee \n2. Delete by id \n3. Modify by id\n ");
			System.out.println("4. Display all\n  5. Display by id\n6. exit ");
			System.out.println("Enter your choice :- ");
			choice =sc.nextInt();
					
			switch(choice)
			{
			case 1->{
				boolean  status=eservice.addnewEmployee();
				if(status)
					System.out.println("Employee added successfully");
				else
					System.out.println("Not found");
			}
			
			case 2->{
				System.out.println("Enter id to delete");
				int empid=sc.nextInt();
				boolean status=eservice.deletebyId(empid);
				if(status)
				{
					System.out.println(" Deleted sccuessfully");
				}
				else
				{
					System.out.println("Not Found");
				}
				}
			
			case 3->{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter new sal");
				double sal=sc.nextDouble();
				boolean status=eservice.updateById(id,sal);
				if(status)
				{
					System.out.println("Updated successfully");
				}
				else
				{
					System.out.println("Not Found");
				}
			}
			
			case 4->{
				List<Employee> list=eservice.getAllData();
				list.forEach(System.out::println);
				
			}
			
			case 5->{
				System.out.println("Enter id");
				int id=sc.nextInt();
				Employee ob=eservice.getById(id);
				if(ob != null)	
				{
					System.out.println(ob);
				}
				else
				{
					System.out.println("Not Found");
				}
			}
			
			case 6->{
				eservice.writeToFile("empdata1.txt");
				sc.close();
				System.out.println("Thank you for visiting......");
			}
			}
		}while( choice != 6);
		
		
				

	}
}


