package com.dao;

import java.util.List;

import com.beans.Product;

public interface ProductDao {

	List<Integer> findAllCategory();

	List<Product> findByCategory(int cid);

}
