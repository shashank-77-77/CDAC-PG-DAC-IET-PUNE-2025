<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Set,com.beans.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Place Order</title>
</head>
<body>
	<%
	Set<Product> cart=(Set<Product>)session.getAttribute("cart");
	double totalamt=0;
	%>
	<table border='2'>
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Order Qty</th>
		<th>Price</th>
		<th>Amount</th>
	</tr>	
	<%
		for(Product p: cart)
		{
			double amount=p.getQty()* p.getPrice();
			totalamt+=amount;
		
	%>
	<tr>
	<td><%=p.getPid() %></td>
	<td><%=p.getPname() %></td>
	<td><%=p.getQty() %>
	<td><%=p.getPrice() %></td>
	<td><%=amount %></td>
	</tr>
	
	<%} 
	%>
	<tr>
	<td colspan='4'>Total Bill Amount</td>
	<td><%=totalamt %></td>
	</tr>	
	</table>
	<form action="payment.jsp">
	<input type="hidden" name="tamt" value=<%=totalamt %>>
		<button type="submit" name="btn">Pay the bill</button>
	</form>
</body>
</html>