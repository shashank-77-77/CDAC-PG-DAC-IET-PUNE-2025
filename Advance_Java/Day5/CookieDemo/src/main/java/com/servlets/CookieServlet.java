package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		
		String btn =req.getParameter("btn");
		switch(btn)
		{
		case "add"->{
			String val =req.getParameter("val");
			Cookie c=new Cookie(name,val);
			resp.addCookie(c);
			out.println("<h1>Cookie added</h1>");
		}
		case "delete" ->{
			Cookie [] carr=req.getCookies();
			for(Cookie c:carr)
			{
				if(c.getName().equals(name))
				{
					c.setMaxAge(0);
					resp.addCookie(c);
					out.println("<h3> Cookie deleted "+name+"</h3>");
					break;
					
				}
			}
		}
		
		case "display"->{
			Cookie[] carr=req.getCookies();
			for(Cookie c :carr)
			{
				out.println("name : "+c.getName()+"----->"+"Value :"+c.getValue());
			}
		}
		}
		
		RequestDispatcher rd= req.getRequestDispatcher("cookiedemo.html");
		rd.include(req, resp);
	}
	

}
