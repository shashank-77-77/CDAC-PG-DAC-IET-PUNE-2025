package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
	}

}
