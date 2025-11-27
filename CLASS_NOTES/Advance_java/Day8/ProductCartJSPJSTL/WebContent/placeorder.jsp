<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Set,com.demo.bean.Product"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%
      double totalamt=0;
    %>
   <table border='2'>
   <tr>
       <th>Product id</th>
       <th>Product name</th>
       <th>order qty</th>
       <th>price</th>
       <th>Amount</th>
       
   </tr>
   <c:forEach var="p" items="${cart}">
   <c:set var="amount" value="${p.qty*p.price}"></c:set>
   <c:set var="totalamt" value="${totalamt+amount}"></c:set>
   <tr>
     <td>${p.pid}</td>
     <td>${p.pname}</td>
     <td>${p.qty}</td>
     <td>${p.price}</td>
     <td>${amount}</td>
     
    </tr>	
   </c:forEach>
    
   <tr>
   <td colspan='4'>Total Bill Amount</td>
   <td>${totalamt}</td>
   
   </tr>
   </table>
   <form action="payment.jsp">
   <input type="hidden" name="tamt" id="tamt" value=<%=totalamt %>>
      <button type="submit" name="btn" id="btn">Pay the bill</button>
   </form>
</body>
</html>