<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Set,com.demo.bean.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%
     Set<Product> cart=(Set<Product>)session.getAttribute("cart");
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
    <% for(Product p:cart){
        double amount=p.getQty()* p.getPrice();
        totalamt+=amount;
    %>
    <tr>
     <td><%=p.getPid() %></td>
     <td><%=p.getPname() %></td>
     <td><%=p.getQty() %></td>
     <td><%=p.getPrice() %></td>
     <td><%=amount%></td>
     
    </tr>	 
    <% }
   %>
   <tr>
   <td colspan='4'>Total Bill Amount</td>
   <td><%=totalamt %></td>
   
   </tr>
   </table>
   <form action="payment.jsp">
   <input type="hidden" name="tamt" id="tamt" value=<%=totalamt %>>
      <button type="submit" name="btn" id="btn">Pay the bill</button>
   </form>
</body>
</html>