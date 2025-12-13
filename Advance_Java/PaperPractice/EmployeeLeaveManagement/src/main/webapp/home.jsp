<form action="applyLeave" method="post">

Employee No:
<input type="text" name="empNo" value="101" readonly><br><br>

Start Date:
<input type="date" name="startDate" required><br><br>

End Date:
<input type="date" name="endDate" required><br><br>

Leave Type:
<select name="leaveType">
    <option value="PAID">Paid Leave</option>
    <option value="OTHER">Other</option>
</select><br><br>

Reason:
<textarea name="reason"></textarea><br><br>

<button type="submit">Apply Leave</button>

</form>

<a href="history">View Leave History</a>
