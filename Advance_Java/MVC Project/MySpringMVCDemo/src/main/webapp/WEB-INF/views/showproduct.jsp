<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>${message}</h2>
	<table border="2">
	<tr>
	<th> Product Id</th>
	<th> Product Name</th>
	<th> Quantity</th>
	<th> Price</th>
	<th> Mfgdate </th>
	<th> cid </th>
	<th> action </th>
	</tr>
	<c:forEach var="prod" items="${plist}">
	<tr>
		<td>${prod.pid}</td>
		<td>${prod.pname}</td>
		<td>${prod.qty}</td>
		<td>${prod.price}</td>
		<td>${prod.mfgdate}</td>
		<td>${prod.cid}</td>
		<td><a href="deleteproduct/${prod.pid}"> Delete</a>/<a href="editproduct/${prod.pid}">Edit</a></td>
	</tr>
	</c:forEach>
	</table>
	<a href="addproduct">Add new Product</a>
</body>
</html>