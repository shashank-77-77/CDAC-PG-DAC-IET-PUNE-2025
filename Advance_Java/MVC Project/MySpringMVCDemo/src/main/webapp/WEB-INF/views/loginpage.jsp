<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/MySpringMVCDemo/login/validateUser" method="post">
	
	User Name<input type="text" name="uname" id="un"><br/>
	Password :<input type="text" name="pass" id="ps"><br/>
	<button type="submit" name="login" id="login" value="login">Login</button>
	
	</form>
</body>
</html>