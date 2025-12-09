<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/MySpringMVCDemo/product/updateProduct" method="post">
Product Id : <input type="text" name="pid" id="pid" value=${prod.pid} readonly><br>
Product Name : <input type="text" name="pname" id="pname" value=${prod.pname}><br>
Product Qty : <input type="text" name="qty" id="qty" value=${prod.qty}><br>
Product Price : <input type="text" name="price" id="price" value=${prod.price}><br>
Product Expdate : <input type="date" name="mfgdate" id="mfgdate" value=${prod.mfgdate}><br>
Product cid : <input type="text" name="cid" id="cid" value=${prod.cid}><br>
<button type="submit" name="btn" id="update" value="update">Update Product</button>

</form>
</body>
</html>