<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h3>${message}</h3>
     
   <form action="/MySpringMVCDemo/login/validateUser" method="post">
     User name: <input type="text" name="uname" id="un"><br/>
     password: <input type="text" name="pass" id="ps"><br/>
     <button type="submit" name="login" id="login" value="login">Login</button>
   
   </form>
   <a href="registerme">Register me? </a> / <a href="#">Forgot password?</a>
</body>
</html>