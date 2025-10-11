package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class TestCourseMgntSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new CourseServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Course\n 2. display all\n3. find by course name\n");
		System.out.println("4. modify course capacity\n 5. find by course capacity\n6. modify course name\n");
		System.out.println("7. display in sorted order of key\n 8. display  in sorted order of value\n");
		System.out.println("9. delete by course name\n10. delete by capacity\n 11.exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status=cservice.addNewCourse();
			if(status) {
				System.out.println("new course added");
			}else{
				System.out.println("duplicate name");
			}
		}
		case 2->{
			Map<String,Integer> cmap=cservice.displayAll();
			Set<String> keys=cmap.keySet();
			keys.forEach(e->System.out.println(e+"---->"+cmap.get(e)));
		}
		case 3->{
			System.out.println("enter course name");
			String cname=sc.next();
			int capacity=cservice.searchByName(cname);
			if(capacity!=-1) {
				System.out.println("CourseName : "+cname+"Capacity: "+capacity);
				
			}else {
				System.out.println("Not Found");
			}
		}
		case 4->{
			System.out.println("enter course name");
			String cname=sc.next();
			System.out.println("enter course new capacity");
			int newcap=sc.nextInt();
			boolean status=cservice.modifyByName(cname,newcap);
			if(status) {
				System.out.println("modification done");
				
			}else {
				System.out.println("Not Found");
			}
		}
		case 5->{
			System.out.println("enter capacity");
	        int capacity=sc.nextInt();
	        Set<String> cset=cservice.displayByCapacity(capacity);
	        if(cset!=null) {
	        	cset.forEach(System.out::println);
	        }else{
	        	System.out.println("Not found");
	        }
	        
	        
	        
		}
		case 6->{
			System.out.println("enetr old course name");
			String oname=sc.next();
			System.out.println("enetr new course name");
			String nname=sc.next();
			boolean status=cservice.modifyCourseName(oname,nname);
			if(status) {
				System.out.println("modification done");
			}else {
				System.out.println("not found");
			}
			
		}
		case 7->{
			Map<String,Integer> cmap=cservice.sortByName();
			Set<String> keys=cmap.keySet();
			keys.forEach(e->System.out.println(e+"--->"+cmap.get(e)));
		}
		case 8->{
			Set<Map.Entry<String,Integer>> eset=cservice.sortByCapacity();
			eset.forEach(e->System.out.println(e.getKey()+"--->"+e.getValue()));
		}
		case 9->{
			System.out.println("Enter course name");
			String cname=sc.next();
			boolean status=cservice.deleteByName(cname);
			if(status) {
				System.out.println("deleted succesfully");
			}else {
				System.out.println("not found");
			}
			
		}
		case 10->{
			System.out.println("Enter capacity");
			int capacity=sc.nextInt();
			boolean status=cservice.deleteByCapacity(capacity);
			if(status) {
				System.out.println("deleted succesfully");
			}else {
				System.out.println("not found");
			}
		}
		case 11->{
			sc.close();
			System.out.println("Thank you for visiting...");
		}
		default->{
			System.out.println("Wrong choice");
		}
		}
		}while(choice!=11);
				

	}

}
