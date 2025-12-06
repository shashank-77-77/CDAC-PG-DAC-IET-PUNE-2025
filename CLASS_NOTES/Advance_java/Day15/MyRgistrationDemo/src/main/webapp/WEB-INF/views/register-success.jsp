<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<html>
<body>
	<h2>Registration successful</h2>
	<p>Username: ${user.username}</p>
	<p>Name: ${user.name}</p>
	<p>Skills: ${user.skills}</p>
	<p>Photo saved at: ${user.photoPath}</p>
</body>
</html>

