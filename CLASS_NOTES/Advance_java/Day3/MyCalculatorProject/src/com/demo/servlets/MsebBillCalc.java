package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MsebBillCalc extends HttpServlet {
	
	double rate1,rate2,rate3;
	
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("in init method of mseb servlet");
		rate1=Double.parseDouble(config.getInitParameter("rate1"));
		rate2=Double.parseDouble(config.getInitParameter("rate2"));
		rate3=Double.parseDouble(config.getInitParameter("rate3"));
				
		
		
	}
	/*public void init() {
		ServletConfig config=this.getServletConfig();
	}*/
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double units=Double.parseDouble(request.getParameter("units"));
		double billamt=0;
		if(units>100) {
			billamt=100*rate1;
		}else {
			billamt=units*rate1;
		}
		if(units>101)  {
			double runits=units-100;
			if(runits>500) {
				billamt=billamt+(500*rate2)+(runits-500)*rate3;
			}else {
				billamt=billamt+(runits*rate2);
			}
		}
		
		out.println("bill amount: "+billamt);
		
		
		
	}
	
	public void destroy() {
		System.out.println("in destroy method");
	}

}
