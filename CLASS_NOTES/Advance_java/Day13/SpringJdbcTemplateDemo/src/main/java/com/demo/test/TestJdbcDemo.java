package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJdbcDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		ProductService pservice=(ProductService)ctx.getBean("productServiceImpl");
		int choice=0;
		do {
		System.out.println("1. Add new product\n2. display all\n 3. display by category");
		System.out.println("4. display by pid\n");
		System.out.println("5. delete by id\n 6. modify by id\n 7. arrange in sorted order");
		System.out.println("8. exit\n choice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status=pservice.addnewProduct();
			if(status) {
				System.out.println("Product added successfully");
			}else {
				System.out.println("Error occured");
			}
		}
		case 2->{
			List<Product> plist=pservice.getAllProduct();
			plist.forEach(System.out::println);
			
		}
		case 3->{
			System.out.println("enter category id");
			int cid=sc.nextInt();
			List<Product> plist=pservice.getByCatId(cid);
			plist.forEach(System.out::println);
		}
		case 4->{
			System.out.println("enter product id");
			int pid=sc.nextInt();
			Product p=pservice.getByPid(pid);
			if(p!=null) {
				System.out.println(p);
			}else {
				System.out.println("not found");
			}
		}
		case 5->{
			System.out.println("enter product id");
			int pid=sc.nextInt();
			boolean status=pservice.deleteByPid(pid);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
		}
		case 6->{
			System.out.println("enter product id");
			int pid=sc.nextInt();
			System.out.println("enter new qty");
			int qty=sc.nextInt();
			System.out.println("enter new price");
			double pr=sc.nextDouble();
			boolean status=pservice.modifyById(pid,qty,pr);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not found");
			}
			
		}
		case 7->{
			List<Product> plist=pservice.sorteByPrice();
			plist.forEach(System.out::println);
		}
		case 8->{
			sc.close();
			System.out.println("Thank ypu for visiting.....!!");
		}
		
		}
		}while(choice!=8);
		

	}

}
