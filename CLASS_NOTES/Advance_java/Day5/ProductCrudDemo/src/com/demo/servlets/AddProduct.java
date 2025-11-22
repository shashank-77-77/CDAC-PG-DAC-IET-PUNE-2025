package com.demo.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class AddProduct extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(req.getParameter("pid"));
		String pname = req.getParameter("pname");
		int qty = Integer.parseInt(req.getParameter("qty"));
		double price = Double.parseDouble(req.getParameter("price"));
		String dt = req.getParameter("expdate");
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		int cid = Integer.parseInt(req.getParameter("cid"));
		Product p = new Product(pid,pname,qty,price,ldt,cid);
		ProductService pservice = new ProductServiceImpl();
		boolean status = pservice.addproduct(p);
		RequestDispatcher rd = req.getRequestDispatcher("showproduct");
		rd.forward(req,response);
		
		
		
	}

}
