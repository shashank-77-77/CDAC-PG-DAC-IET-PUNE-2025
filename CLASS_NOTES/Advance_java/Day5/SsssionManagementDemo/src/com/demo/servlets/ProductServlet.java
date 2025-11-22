package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class Product
 */
@WebServlet("/showproduct")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		int cid=Integer.parseInt(request.getParameter("category"));
		ProductService pservice= new ProductServiceImpl();
		List<Product> plist= pservice.getByCid(cid);
		out.println("<form action='addtocart'>");
		for(Product p:plist)
		{
			out.println("<input type='checkbox' name='pname' id ='"+p.getPid()+"' value='"+p.getPname()+"'><label for='"+p.getPid()+"'>"+p.getPname()+"</label>");
		}
		out.println("<button type='submit' name= 'btn' id='btn'>Add To cart</button>");
		out.println("</form>");
	}

	
}
