<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html> 
<head>
<title>Register</title>
</head> 
<body> 
<h2>Register</h2> 
	<form:form action="register" method="post" modelAttribute="registrationForm" enctype="multipart/form-data"> 
	<table> 
	<tr>
	<td>User ID:</td>
	<td><form:input path="userId"/></td></tr> 
	<tr><td>Name:</td><td><form:input path="name"/></td></tr> 
	<tr>
	<td>Gender:</td>
	<td> 
	<form:radiobutton path="gender" value="Male"/>Male 
	<form:radiobutton path="gender" value="Female"/>Female 
	</td></tr> 
	<tr>
	<td>DOB:</td>
	<td><form:input path="dob" type="date"/>
	</td></tr> 
	<tr>
	<td>Username:</td>
	<td><form:input path="username"/></td></tr> 
	<tr>
	<td>Password:</td>
	<td><form:password path="password"/></td></tr> 
	<tr>
	<td>Confirm Password:</td>
	<td><form:password path="confirmPassword"/></td></tr> 
	
	<tr><td>Skills:</td><td> 
	<c:forEach var="s" items="${availableSkills}"> 
	<form:checkbox path="skills" value="${s}"/> ${s} <br/> 
	</c:forEach> </td></tr> 
	<tr><td>Profile Photo:</td>
	<td><input type="file" name="photo"/></td></tr> 
	<tr>
	<td colspan="2"><input type="submit" value="Register"/></td></tr> 
	</table> 
	<form:errors path="*" cssClass="error"/> 
	</form:form> 
</body> 
</html>