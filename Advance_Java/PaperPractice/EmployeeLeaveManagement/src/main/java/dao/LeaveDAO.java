package dao;

import java.sql.*;
import java.util.*;
import model.LeaveRequest;
import util.DBUtil;

public class LeaveDAO {

    public void applyLeave(LeaveRequest lr) throws Exception {

        String sql =
            "INSERT INTO leave_request " +
            "(emp_no,start_date,end_date,leave_type,reason,status,applied_date) " +
            "VALUES (?,?,?,?,?,'APPLIED',CURDATE())";

        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, lr.getEmpNo());
        ps.setDate(2, lr.getStartDate());
        ps.setDate(3, lr.getEndDate());
        ps.setString(4, lr.getLeaveType());
        ps.setString(5, lr.getReason());

        ps.executeUpdate();
        con.close();
    }

    public List<LeaveRequest> getLeaveHistory(int empNo) throws Exception {

        List<LeaveRequest> list = new ArrayList<>();

        Connection con = DBUtil.getConnection();
        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM leave_request WHERE emp_no=?");

        ps.setInt(1, empNo);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            LeaveRequest lr = new LeaveRequest();
            lr.setLeaveId(rs.getInt("leave_id"));
            lr.setStartDate(rs.getDate("start_date"));
            lr.setEndDate(rs.getDate("end_date"));
            lr.setLeaveType(rs.getString("leave_type"));
            lr.setStatus(rs.getString("status"));
            lr.setAppliedDate(rs.getDate("applied_date"));
            list.add(lr);
        }

        con.close();
        return list;
    }
}
