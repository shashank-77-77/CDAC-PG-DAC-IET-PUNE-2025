package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean addnewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr pid");
		int pid=sc.nextInt();
		System.out.println("Enter name");
		String pname=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("Enter mfgdate(dd/MM/yyyy");
		String ldt=sc.next();
		LocalDate mfgdate=LocalDate.parse(ldt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("enter category id");
		int cid=sc.nextInt();
		Product p=new Product(pid,pname,qty,price,mfgdate,cid);
		return pdao.save(p);
		
	}

	@Override
	public List<Product> getAllProduct() {
		return pdao.findAllProducts();
	}

	@Override
	public List<Product> getByCatId(int cid) {
		return pdao.findByCatId(cid);
	}

	@Override
	public Product getByPid(int pid) {
		return pdao.findByPid(pid);
	}

	@Override
	public boolean deleteByPid(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public boolean modifyById(int pid, int qty, double pr) {
		return pdao.updateById(pid,qty,pr);
	}

	@Override
	public List<Product> sorteByPrice() {
		return pdao.arrangeByPrice();
	}
	
	

}
