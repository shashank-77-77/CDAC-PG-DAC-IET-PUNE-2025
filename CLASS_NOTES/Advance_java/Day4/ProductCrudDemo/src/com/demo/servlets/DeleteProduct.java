package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class DeleteProduct extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		int pid=Integer.parseInt(req.getParameter("pid"));
		ProductService pservice=new ProductServiceImpl();
		boolean status=pservice.deleteById(pid);
		RequestDispatcher rd=req.getRequestDispatcher("showproduct");
		rd.forward(req,resp);
		
	}

}
