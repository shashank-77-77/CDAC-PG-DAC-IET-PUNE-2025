package com.dao;

import java.util.List;

import com.beans.Product;

public interface ProductDao {

	List<Product> findAllProducts();

}
