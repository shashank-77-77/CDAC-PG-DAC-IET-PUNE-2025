<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Your order is placed successfully</h1>
	<h2>Your bill amount is <%=request.getParameter("tamt") %> paid successfully </h2>
	<h4>Your order will be delivered soon......</h4>
	<h4>Thank you for visiting, do visit again</h4>
	<%--remove the session --%>
	<%
		System.out.println("session is invalidated");
		session.invalidate();%>
		<jsp:include page="Login.jsp"></jsp:include>
</body>
</html>