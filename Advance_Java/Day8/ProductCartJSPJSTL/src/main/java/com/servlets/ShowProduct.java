package com.servlets;

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

import com.beans.MyUser;
import com.beans.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

/**
 * Servlet implementation class ShowProduct
 */
@WebServlet("/showproduct")
public class ShowProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		MyUser user=(MyUser) session.getAttribute("user");
		if(user!=null && user.getRole().equals(user))
		{
			ProductService pservice=new ProductServiceImpl();
			List<Product> plist=pservice.getAllProducts();
			request.setAttribute("plist", plist);
			RequestDispatcher rd=request.getRequestDispatcher("showproduct.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.print("<h1>Invalid Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		doGet(request, response);
	}

}
