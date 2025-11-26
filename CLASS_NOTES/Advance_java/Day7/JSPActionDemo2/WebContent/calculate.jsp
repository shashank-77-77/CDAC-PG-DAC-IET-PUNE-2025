<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%
     int num1=Integer.parseInt(request.getParameter("num1"));
   int num2=Integer.parseInt(request.getParameter("num2"));
   int addition=num1+num2;
   session.setAttribute("user","userdata");
   String message="Addition :"+addition;
   %>
   
   <jsp:forward page="displaydata.jsp">
      <jsp:param value="<%=message%>" name="msg"/>
   </jsp:forward>
   
</body>
</html>