package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImpl;

public class TestOrdemgntSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService oservice=new OrderServiceImpl();
		int choice=0;
		do {
		System.out.println("1. add new customer\n2. display all\n3. display by customer");
		System.out.println("4. delete customer\n5. add a new item in existing order");
		System.out.println("6. delete item from existing order\n7.exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status=oservice.addNewCustomer();
			if(status) {
				System.out.println("Added  successfully");
				
			}else {
				System.out.println("Not added");
			}
		}
		case 2->{
			Map<Customer,List<Item>> omap=oservice.displayAll();
			Set<Customer> keys=omap.keySet();
			keys.forEach(c->System.out.println(c+"---->"+omap.get(c)));
			
		}
		case 3->{}
		case 4->{}
		case 5->{}
		case 6->{}
		case 7->{
			sc.close();
			System.out.println("Thank you for visiting.....");
		}
		default->{
			System.out.println("Wrong choice");
		}
		
		
		
		
		
		
		}
		}while(choice!=7);
	}

}
