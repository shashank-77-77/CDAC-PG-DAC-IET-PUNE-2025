package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/servlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("nm");
		out.println("<form action='servlet2' method='get'>");
		out.println("Location : <input type='text' name='location' id='location'/><br/>");
		out.println("<input type='hidden' name='nm' id='nm' value='"+name+"'/><br/>");
		out.println(" <Button type='submit' name='btn' id='btn'>submit data</button><br/>");
		
		out.println("</form>");
	}

}
