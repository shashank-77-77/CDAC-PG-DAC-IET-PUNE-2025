package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Integer> findAllCategory();

	List<Product> findByCategory(int cid);

}
