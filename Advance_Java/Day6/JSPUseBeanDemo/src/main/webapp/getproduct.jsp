<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Product</title>
</head>
<body>
<%--
  int pid=Integer.parseInt(request.getParameter("pid"));
  String pname=request.getParameter("pname");
  int qty=Integer.parseInt(request.getParameter("qty"));
  double price=Double.parseDouble(request.getParameter("price"));
  Product p=new Product(pid,pname,qty,price);
--%>
<jsp:useBean id="p" class="com.beans.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>
<%--
<jsp:setProperty name="p" property="pid" value='<%=request.getParameter("pid") %>'> </jsp:setProperty>
<jsp:setProperty name="p" property="pname" value='<%=request.getParameter("pname") %>'> </jsp:setProperty>
<jsp:setProperty name="p" property="qty" value="<%=request.getParameter("qty") %>"> </jsp:setProperty>
<jsp:setProperty name="p" property="price" value="<%=request.getParameter("price") %>"> </jsp:setProperty>
 --%>
 
<h1>Product Data</h1>
Product id :<jsp:getProperty property="pid" name="p"/>
Product Name:<jsp:getProperty property="pname" name="p"/>
Product Quantity:<jsp:getProperty property="qty" name="p"/>
Product Price: <jsp:getProperty property="price" name="p"/>
</body>
</html>