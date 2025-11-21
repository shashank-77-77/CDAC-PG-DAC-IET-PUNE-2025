package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateInterest extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double principal=Double.parseDouble(request.getParameter("principal"));
		float rate=Float.parseFloat(request.getParameter("rate"));
		int years=Integer.parseInt(request.getParameter("years"));
		double ans=(principal*rate*years)/100;
		out.println("<h3>Interset :"+ans+"</h3>");
	}

}
