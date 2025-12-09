<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertProduct" method="post">
Product Id : <input type="text" name="pid" id="pid"><br>
Product Name : <input type="text" name="pname" id="pname"><br>
Product Qty : <input type="text" name="qty" id="qty"><br>
Product Price : <input type="text" name="price" id="price"><br>
Product Expdate : <input type="date" name="mfgdate" id="mfgdate"><br>
Product cid : <input type="text" name="cid" id="cid"><br>
<button type="submit" name="btn" id="insert">Add new Product</button>

</form>
</body>
</html>