<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.demo.bean.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
    List<Product> plst=(List<Product>)request.getAttribute("plist");
     %>
     <form action="placeorder.jsp">
         <button type="submit" name="order" id="order">Place order</button>
     </form>
     <%  
  for(Product p:plst){%>
    <div>
      <form action="addtocart">
         Product Id : <%=p.getPid() %><br/>
         Product name: <%=p.getPname() %><br/>
         Product price : <%=p.getPrice() %><br/>
         <input type="hidden" name="pid" id="pid" value="<%=p.getPid() %>">
         <input type="hidden" name="pname" id="pname" value="<%=p.getPname()%>"/>
         <input type="hidden" name="price" id="price" value="<%=p.getPrice()%>"/>
         Quantity : <input type="text" name="qty" id="qty"><br/>
         <button type="submit" name="btn" id="btn">Add to cart</button>
      </form>
    </div>
    
    <%}
  %>
</body>
</html>