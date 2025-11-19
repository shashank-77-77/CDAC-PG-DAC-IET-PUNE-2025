package com.dao;

import com.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	boolean removeById(int id);

	boolean updateById(int id, int qty, double price);

}
