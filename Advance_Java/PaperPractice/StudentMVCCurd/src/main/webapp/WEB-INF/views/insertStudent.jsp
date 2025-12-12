<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertStudent" method="post">
	Student Id <input type="number" name="studentID" id="studentID" >
	Student Name <input type="text" name="name" id="name">
	Rank <input type="number" name="rnk" id="rnk">
	EmailID<input type="text" name="emailID" id="emailID">
	<button type="submit" name="btn" id="insert">Add new Student</button>
	</form>
</body>
</html>