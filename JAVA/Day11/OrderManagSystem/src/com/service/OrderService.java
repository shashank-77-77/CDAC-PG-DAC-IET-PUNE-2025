package com.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.bean.Customer;
import com.bean.Item;

public interface OrderService {

	boolean addNewCustomer();

	Map<Customer, List<Item>> displayAll();

	

	Entry<Customer, List<Item>> findById(int cid);

	boolean deleteByCid(int cid);

	

	boolean addNewItem(int cid, Item item);

	boolean removeById(int cid, int iid);

}
