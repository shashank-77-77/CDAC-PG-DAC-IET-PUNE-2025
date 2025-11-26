<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String fnm="Soham";
	String lnm="Shelar"; 
%>
	<h1>Hello Everyone</h1>
	<hello:myhellotag frame="<%=fnm %>" lname="<%=lnm %>"> </hello:myhellotag>
	<hello:calculatedata num1="${param.num1 }" num2="${param.num2 }"></hello:calculatedata>

</body>
</html>