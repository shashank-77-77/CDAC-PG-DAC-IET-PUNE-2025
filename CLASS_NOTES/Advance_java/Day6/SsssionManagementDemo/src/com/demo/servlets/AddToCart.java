package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		MyUser user =(MyUser) session.getAttribute("user");
		if (user != null)
		{
			List<String> cart= (List<String>) session.getAttribute("cart");
			if(cart==null)
			{
				cart=new ArrayList<>();
				
			}
			//retrieve the values from the checkboxes
			String[] parr=request.getParameterValues("pname");
			
			for(String nm:parr)
			{
				cart.add(nm);
				
			}
			System.out.println(cart);
			session.setAttribute("cart",cart);
			RequestDispatcher rd = request.getRequestDispatcher("category");
			rd.forward(request, response);
			
		}
		else
		{
			out.println("<h1>Unautherize access</h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		
		
	}

}
