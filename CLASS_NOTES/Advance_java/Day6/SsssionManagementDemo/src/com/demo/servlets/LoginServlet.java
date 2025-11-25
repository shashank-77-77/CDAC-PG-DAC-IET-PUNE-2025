package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;



@WebServlet("/validateuser")
public class LoginServlet extends HttpServlet{
     public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	 response.setContentType("text/html");
    	 PrintWriter out =response.getWriter();
    	 String uname=request.getParameter("uname");
    	 String pass= request.getParameter("pass");
    	 LoginService lservice= new LoginServiceImpl();
    	 MyUser user=lservice.validateUser(uname,pass);
    	 
    	 
    	 if(user != null)
    	 {
    	 //store user in session
    	 HttpSession session= request.getSession();
    	 if(session.isNew()) {
    		 System.out.println("new session");
    		 session.setMaxInactiveInterval(20000);
    	 }
    	 session.setAttribute("user",user);
    	 RequestDispatcher rd =request.getRequestDispatcher("category");
    	 rd.forward(request, response);
    	 }else
    	 {
    		 //if username and password is wrong
    		out.println("<h5>Invalid credential</h5>");
    		RequestDispatcher rd =request.getRequestDispatcher("Login.html");
       	    rd.include(request, response);
       	    
    		
    	 }
    	 
    	 
     }
}
