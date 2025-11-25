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
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		MyUser user=(MyUser) session.getAttribute("user");
		if(user!=null && user.getRole().equals("user")) {
			String btn=request.getParameter("btn");
			switch(btn) {
			case "show"->{
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
				out.println("<a href='logout'>Logout</a>");
			}
			case "order"->{
				RequestDispatcher rd= request.getRequestDispatcher("placeorder");
				rd.forward(request, response);
			}
			}
			
		}else {
			out.println("<h1>Unautherize access</h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		
	}

	
}
