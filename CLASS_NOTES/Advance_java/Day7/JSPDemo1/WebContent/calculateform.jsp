<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%@include file="MyHeader.html" %>
   <form action="getresult.jsp">
   Num1 : <input type="text" name="num1" id="n1"/><br/>
   Num2 : <input type="text" name="num2" id="n2"/><br/>
   <button type="submit" name="btn" id="btn" value="add">Addition</button>
   <button type="submit" name="btn" id="btn" value="fact">Factorial</button>
   </form>
   <%@include file="MyFooter.html" %>
</body>
</html>