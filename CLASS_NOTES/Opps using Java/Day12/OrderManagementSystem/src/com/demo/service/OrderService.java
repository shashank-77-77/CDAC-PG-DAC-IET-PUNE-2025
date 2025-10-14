package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderService {

	boolean addNewCustomer();

	Map<Customer, List<Item>> displayAll();

	Entry<Customer, List<Item>> findByCustomer(int cid);

	boolean deleteById(int cid);

	boolean addNewItem(int cid, Item item);

	boolean removeItemById(int cid, int iid);

}
