<%@ page import="java.util.*,model.LeaveRequest" %>

<table border="1">
<tr>
    <th>ID</th>
    <th>Start</th>
    <th>End</th>
    <th>Type</th>
    <th>Status</th>
</tr>

<%
List<LeaveRequest> list =
    (List<LeaveRequest>) request.getAttribute("history");

for (LeaveRequest lr : list) {
%>
<tr>
    <td><%= lr.getLeaveId() %></td>
    <td><%= lr.getStartDate() %></td>
    <td><%= lr.getEndDate() %></td>
    <td><%= lr.getLeaveType() %></td>
    <td><%= lr.getStatus() %></td>
</tr>
<% } %>
</table>
