
package com.college.attendance.service;

import com.college.attendance.bean.Attendance;
import com.college.attendance.dao.AttendanceDAO;

import java.util.List;

public class AttendanceService {
    private AttendanceDAO dao = new AttendanceDAO();

    public void addAttendance(Attendance a) {
        dao.save(a);
    }

    public List<Attendance> getAll() {
        return dao.findAll();
    }

    public void delete(int id) {
        dao.delete(id);
    }
}
