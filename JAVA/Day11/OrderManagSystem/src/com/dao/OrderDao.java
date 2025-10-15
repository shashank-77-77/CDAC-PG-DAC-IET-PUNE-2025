package com.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.bean.*;

public interface OrderDao {

	boolean save(Customer c, List<Item> lst);

	Map<Customer, List<Item>> findAll();

	Entry<Customer, List<Item>> findById(int cid);

	boolean deleteByCid(int cid);

	boolean addNewItem(int cid, Item item);

	boolean removeById(int cid, int iid);

}
