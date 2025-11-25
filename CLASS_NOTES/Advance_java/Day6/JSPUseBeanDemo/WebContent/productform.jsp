<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="getproduct.jsp">
  Product id : <input type="text" name="pid" id="prodid"/><br/>
  Product Name: <input type="text" name="pname" id="pname"/><br/>
  Product qty : <input type="text" name="qty" id="qty"/><br/>
  Product price: <input type="text" name="price" id="price"/><br/>
  <button type="submit" name="btn" id="btn" value="add">Add product</button>  
  </form>
</body>
</html>