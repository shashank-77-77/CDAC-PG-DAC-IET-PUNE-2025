package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String btn=req.getParameter("btn");
		int num1=Integer.parseInt(req.getParameter("num1"));
		//multiple submit button on a form, use switch case
		switch(btn){
		case "add"->{
			int num2=Integer.parseInt(req.getParameter("num2"));
			int ans=num1+num2;
			out.println("<h2>Addition :"+ans+"</h2>");
		}
		case "sub"->{
			
			int num2=Integer.parseInt(req.getParameter("num2"));
			int ans=num1-num2;
			out.println("<h2>Subtraction :"+ans+"</h2>");
		}
		case "fact"->{
			
			int ans=factorial(num1);
			out.println("<h2>Factorial :"+ans+"</h2>");
		}
		}
		
		
		
	}

	private int factorial(int num1) {
		int fact=1;
		for(int i=1;i<=num1;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
