
<%@ page import="java.util.*,com.college.attendance.bean.Attendance" %>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Subject</th><th>Date</th><th>Status</th><th>Action</th></tr>
<%
List<Attendance> list = (List<Attendance>)request.getAttribute("list");
for(Attendance a : list){
%>
<tr>
<td><%=a.getId()%></td>
<td><%=a.getStudentName()%></td>
<td><%=a.getSubject()%></td>
<td><%=a.getDate()%></td>
<td><%=a.getStatus()%></td>
<td><a href="attendance?delete=<%=a.getId()%>">Delete</a></td>
</tr>
<% } %>
</table>
<a href="attendance-form.jsp">Add New</a>
