package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;

/**
 * Servlet implementation class PlaceOrderServlet
 */
@WebServlet("/placeorder")
public class PlaceOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MyUser user=(MyUser) session.getAttribute("user");
		PrintWriter out=response.getWriter();
		if(user!=null && user.getRole().equals("user")) {
			//retrieve the cart from session
			List<String> cart=(List<String>) session.getAttribute("cart");
			//display the cart
			cart.stream().forEach(s->out.println(s));
			out.println("<h4>Your order is placed successfully</h4>");
			out.println("<a href='logout'>Logout</a>");
		}
		
	}

	

}
