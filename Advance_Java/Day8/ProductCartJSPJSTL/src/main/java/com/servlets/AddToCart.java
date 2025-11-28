package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.MyUser;
import com.beans.Product;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		MyUser user = (MyUser) session.getAttribute("user");
		if(user != null && user.getRole().equals("user"))
		{
			int pid=Integer.parseInt(request.getParameter("pid"));
			String pname=request.getParameter("pname");
			double price =Double.parseDouble(request.getParameter("price"));
			int ord_qty=Integer.parseInt(request.getParameter("qty"));
			Set<Product> cart= (Set<Product>) session.getAttribute("cart");
			if(cart==null)
			{
				cart=new HashSet<>();
			}
			Product p=new Product(pid,pname,ord_qty,price,null,0);
			boolean status=cart.add(p);
			session.setAttribute("cart", cart);
			cart.stream().forEach(System.out::println);
			RequestDispatcher rd= request.getRequestDispatcher("showproduct");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		
	}



}
