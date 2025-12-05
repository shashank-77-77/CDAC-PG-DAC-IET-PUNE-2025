package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addnewProduct();

	List<Product> getAllProduct();

	List<Product> getByCatId(int cid);

	Product getByPid(int pid);

	boolean deleteByPid(int pid);

	boolean modifyById(int pid, int qty, double pr);

	List<Product> sorteByPrice();

}
