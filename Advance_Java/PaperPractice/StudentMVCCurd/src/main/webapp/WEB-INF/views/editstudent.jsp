<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/StudentMVCCurd/student/updatestudent" method="post">
	Student Id:<input type="number" name="studentID" id="StudentID" value="${stud.studentID}">
	Student Name:<input type="text" name="name" id="name" value="${stud.name}">
	Student Id:<input type="number" name="rnk" id="rnk" value="${stud.rnk}">
	Student Id:<input type="text" name="emailID" id="emailID" value="${stud.emailID}">
	<button type="submit" name ="btn" id="update" value="update">Update Product</button>
	
	
	
	
	</form>
</body>
</html>