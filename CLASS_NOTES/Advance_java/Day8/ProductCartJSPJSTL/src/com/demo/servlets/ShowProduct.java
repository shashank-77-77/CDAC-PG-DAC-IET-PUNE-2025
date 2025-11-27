package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.bean.MyUser;
import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


//it will retrieve all products from databse and show it in table form
@WebServlet("/showproduct")
public class ShowProduct extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		MyUser user=(MyUser) session.getAttribute("user");
		//if user is valid
		if(user!=null && user.getRole().equals("user")) {
			ProductService pservice=new ProductServiceImpl();
			List<Product> plist=pservice.getAllProducts();
			//forward plist to some jsp page to display products
			request.setAttribute("plist", plist);
			RequestDispatcher rd=request.getRequestDispatcher("showproduct.jsp");
			rd.forward(request, response);
			
		}else {
			//if user is invalid
			out.print("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
			
		}
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		doPost(req,resp);
	}
	

}
