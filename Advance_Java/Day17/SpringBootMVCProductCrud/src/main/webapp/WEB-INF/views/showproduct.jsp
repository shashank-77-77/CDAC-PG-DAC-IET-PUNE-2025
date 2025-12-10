<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='2'>
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Product qty</th>
<th>Price</th>
<th>Product expdate</th>
<th>cid</th>
<th>action</th>
</tr>

<c:forEach var="prod"  items="${plist}">
<tr>
	<td>${prod.pid}</td>
	<td>${prod.pname}</td>
	<td>${prod.qty}</td>
	<td>${prod.price}</td>
	<td>${prod.expdate}</td>
	<td>${prod.cid}</td>
	<td><a href="deleteproduct/${prod.pid}">delete</a>/<a href="editproduct/${prod.pid}">Edit</a></td>
</tr>
</c:forEach>
</table>
<a href="addproduct">Add new product</a>
</body>
</html>