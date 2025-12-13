
package com.college.attendance.dao;

import com.college.attendance.bean.Attendance;
import com.college.attendance.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AttendanceDAO {

    public void save(Attendance a) {
        String sql = "INSERT INTO attendance(student_name, subject, attendance_date, status) VALUES (?,?,?,?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getStudentName());
            ps.setString(2, a.getSubject());
            ps.setDate(3, a.getDate());
            ps.setString(4, a.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Attendance> findAll() {
        List<Attendance> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM attendance")) {

            while (rs.next()) {
                Attendance a = new Attendance();
                a.setId(rs.getInt("id"));
                a.setStudentName(rs.getString("student_name"));
                a.setSubject(rs.getString("subject"));
                a.setDate(rs.getDate("attendance_date"));
                a.setStatus(rs.getString("status"));
                list.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void delete(int id) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM attendance WHERE id=?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
