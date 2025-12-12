<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border='2'>
	<tr>
		<th>Student Id</th>
		<th>Student Name</th>
		<th>Rank</th>
		<th>EmailId</th>
		<th>action</th>
	</tr>
	
	<c:forEach var="stud" items="${slist}">
	<tr>
		<td>${stud.studentID}</td>
		<td>${stud.name}</td>
		<td>${stud.rnk}</td>
		<td>${stud.emailID}</td>
		<td><a href="deletestudent/${stud.studentID}">Delete</a>/<a href="editstudent/${stud.studentID}">Edit </a></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="addstudent">Add new Student</a>
</body>
</html>