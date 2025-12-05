package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAllProducts();

	List<Product> findByCatId(int cid);

	Product findByPid(int pid);

	boolean removeById(int pid);

	boolean updateById(int pid, int qty, double pr);

	List<Product> arrangeByPrice();

}
