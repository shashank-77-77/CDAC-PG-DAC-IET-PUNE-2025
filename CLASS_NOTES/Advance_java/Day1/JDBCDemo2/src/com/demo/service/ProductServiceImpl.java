package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
   private ProductDao pdao;
   
   public ProductServiceImpl() {
	   pdao=new ProductDaoImpl();
   }

@Override
public boolean addNewProduct() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr pid");
	int pid=sc.nextInt();
	System.out.println("enter product name");
	String pname=sc.next();
	System.out.println("enetr qty");
	int qty=sc.nextInt();
	System.out.println("enetr price");
	double price=sc.nextDouble();
	System.out.println("enetr mfgdate (dd/MM/yyyy)");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	Product p=new Product(pid,pname,qty,price,ldt);
	return pdao.save(p);
}
   
}
