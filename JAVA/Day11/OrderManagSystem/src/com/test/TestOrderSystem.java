package com.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.bean.Customer;
import com.bean.Item;
import com.service.OrderService;
import com.service.*;
import com.service.OrderServiceImpt;

public class TestOrderSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		OrderService oservice=new OrderServiceImpt();
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
		case 3->{
			System.out.println("Enter customer id to search");
			int cid=sc.nextInt();
			Map.Entry<Customer,List<Item>> c1=oservice.findById(cid);
			if(c1 != null)
			{
				System.out.println(c1.getKey()+"------>"+c1.getValue());
			}else
			{
				System.out.println("Not found");
			}
			
			
			
		}
		case 4->{
			System.out.println("Enter customer id to delete");
			int cid=sc.nextInt();
			boolean status =oservice.deleteByCid(cid);
			if(status)
			{
				System.out.println("Deleted Succesfully");
			}
			else
			{
				System.out.println("Not Found");
			}
		}
		case 5->{
			System.out.println("enter customer id");
			int cid=sc.nextInt();
			System.out.println("enter Item id");
			int iid=sc.nextInt();
			System.out.println("enter item name");
			String inm=sc.next();
			System.out.println("enter qty");
			int qty=sc.nextInt();
			System.out.println("enter Item price");
			double price=sc.nextDouble();
			boolean status=oservice.addNewItem(cid,new Item(iid,inm,qty,price));
			if(status){
				System.out.println("added successfully");
			}else {
				System.out.println("not found");
			}
		}
		case 6->{
			System.out.println("Enter customer id");
			int cid=sc.nextInt();
			System.out.println("Enter Item id");
			int iid=sc.nextInt();
			boolean status=oservice.removeById(cid,iid);
			if(status)
			{
				System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Not Found");
			}
		}
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
