package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.bean.Customer;
import com.bean.Item;
import com.dao.OrderDao;
import com.dao.OrderDaoImpl;

public class OrderServiceImpt implements OrderService{
    private OrderDao odao;
    
	public OrderServiceImpt() {
		super();
		odao=new OrderDaoImpl();
	}

	@Override
	public boolean addNewCustomer() {
		Scanner sc=new Scanner(System.in);
		//accept customer details
		System.out.println("Enter id");
		int cid=sc.nextInt();
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter mobile");
		String mob=sc.next();
		Customer c=new Customer(cid,nm,mob);
		//accept list of items
		List<Item> lst=new ArrayList<>();
		String ans=null;
		do {
		System.out.println("enter item id");
		int id=sc.nextInt();
		System.out.println("enter item name");
		String inm=sc.next();
		System.out.println("enter item qty");
		int qty=sc.nextInt();
		System.out.println("enter item price");
		double price=sc.nextDouble();
		Item item=new Item(id,inm,qty,price);
		lst.add(item);
		System.out.println("Do you want to continue(y/n)?");
		ans=sc.next();
		}while(ans.equals("y"));
		return odao.save(c,lst);
		
		
	}

	@Override
	public Map<Customer, List<Item>> displayAll() {
		return odao.findAll();
	}



	@Override
	public Entry<Customer, List<Item>> findById(int cid) {
		return odao.findById(cid);
	}

	@Override
	public boolean deleteByCid(int cid) {
		return odao.deleteByCid(cid);
	}

	@Override
	public boolean addNewItem(int cid, Item item) {
		
		return odao.addNewItem(cid, item);
		
	}

	@Override
	public boolean removeById(int cid, int iid) {
		return odao.removeById(cid,iid);
	}
	
	




}


