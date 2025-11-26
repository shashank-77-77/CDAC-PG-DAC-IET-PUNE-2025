<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
  int pid=Integer.parseInt(request.getParameter("pid"));
  String pname=request.getParameter("pname");
  int qty=Integer.parseInt(request.getParameter("qty"));
  double price=Double.parseDouble(request.getParameter("price"));
  Product p=new Product(pid,pname,qty,price);
--%>
<%-- <jsp:useBean id="pservice" type="com.demo.service.ProducService" class="com.demo.service.ProductServiceImpl"></jsp:useBean>--%>

<%--Create a object --%>
<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>

<%--Assign form values to the object --%>

<jsp:setProperty property="*" name="p"/>

<%--
<jsp:setProperty name="p" property="pid" value='<%=request.getParameter("pid") %>'> </jsp:setProperty>
<jsp:setProperty name="p" property="pname" value='<%=request.getParameter("pname") %>'> </jsp:setProperty>
<jsp:setProperty name="p" property="qty" value="<%=request.getParameter("qty") %>"> </jsp:setProperty>
<jsp:setProperty name="p" property="price" value="<%=request.getParameter("price") %>"> </jsp:setProperty>
 --%>

<%--retrieve the data from the object --%>
<h1>Product data:</h1>
Product Id: <jsp:getProperty property="pid" name="p"/>
Product Name: <jsp:getProperty property="pname" name="p"/>
Product Quantity: <jsp:getProperty property="qty" name="p"/>
Product price: <jsp:getProperty property="price" name="p"/>
</body>
</html>













