package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDao{
   static Map<Customer,List<Item>> hm;
   static {
	   hm=new HashMap<>();
	   Customer c1=new Customer(10,"Sushrut","33333");
	   List<Item> lst=new ArrayList<>();
	   lst.add(new Item(1001,"Chair",34,5678));
	   lst.add(new Item(1002,"Table",30,7678));
	   hm.put(c1, lst);
	   Customer c2=new Customer(11,"Pranav","4444");
	   List<Item> lst1=new ArrayList<>();
	   lst1.add(new Item(1001,"Shelf",40,2678));
	   lst1.add(new Item(1002,"drawer",20,5678));
	   hm.put(c2, lst1);
   }
@Override
public boolean save(Customer c, List<Item> lst) {
	if(!hm.containsKey(c)) {
		hm.put(c,lst);
		return true;
	}
	return false;
}
@Override
public Map<Customer, List<Item>> findAll() {
	return hm;
}
}
