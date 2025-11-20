package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.beans.Product;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;

public class ProductServiceImpl implements  ProductService{

	
	private ProductDao pdao;
	
	public ProductServiceImpl()
	{
		pdao=new ProductDaoImpl();
	}
	
	
	@Override
	public boolean addNewProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		System.out.println("Enter product name ");
		String pname=sc.next();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter mfgdate (dd/MM/yyyy");
		String dt=sc.next();
		LocalDate ltd=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p = new Product(pid,pname,qty,price,ltd); 
		return pdao.save(p);
	
	}


	@Override
	public boolean deletebyId(int id) {
		
		return pdao.removeById(id);
	}


	@Override
	public boolean modifyById(int id, int qty, double price) {
		return pdao.updateById(id,qty,price);
	}


	@Override
	public Product getById(int id) {
		
		return pdao.findById(id);
	}


	@Override
	public List<Product> getAllProduct() {
		return pdao.findAllProducts();
	}


	@Override
	public List<Product> sortByPrice() {
		
		return pdao.arrangeByPrice();
	}
	
	
	
}

