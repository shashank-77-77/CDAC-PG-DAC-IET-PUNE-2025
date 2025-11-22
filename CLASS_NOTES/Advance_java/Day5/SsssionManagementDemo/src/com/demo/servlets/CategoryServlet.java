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

import com.demo.beans.MyUser;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		//check user exist in session 
		HttpSession session = request.getSession();
		MyUser user= (MyUser)session.getAttribute("user");
		if(user !=null && user.getRole().equals("user"))
		{
			ProductService pservice=new ProductServiceImpl();
			List<Integer> carr=pservice.getAllCategory();
			
			out.println("<form action ='showproduct'> <select name='category'>");
			for(int i:carr)
			{
				out.println("<option value='"+i+"'>"+i+"</option>");
			}
			out.println("</select>");
			out.println("<button type='submit' name='btn' id='btn' value ='show'>submit</button>");
			out.println("<button type='submit' name='btn' id='btn' value ='order' >placeOrder</button>");
			out.println("</form>");
		}
		else
		{
			out.println("<h1>Unautherize access</h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
