<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Using JSP expression</h2>
   Number1: <%=request.getParameter("num1") %>
   Number2: <%=request.getParameter("num2") %>
   Message: <%=request.getParameter("msg") %>
   user: <%=session.getAttribute("user") %>
   
   <hr>
   <h2>Using EL Language</h2>
   Number 1= ${param.num1}
    Number 2= ${param.num2}
    Message = ${param.msg}
    User: ${user}
    
</body>
</html>