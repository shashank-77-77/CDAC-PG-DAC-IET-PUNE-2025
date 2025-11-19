package com.service;

public interface ProductService {

	boolean addNewProduct();

	boolean deletebyId(int id);

	boolean modifyById(int id, int qty, double price);

}
