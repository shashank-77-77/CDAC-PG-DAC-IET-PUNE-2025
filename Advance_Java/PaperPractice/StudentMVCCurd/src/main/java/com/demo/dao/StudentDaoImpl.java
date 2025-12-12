package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<Student> findAllStudent() {
		List<Student>  slist = jdbctemplate.query("select * from student", (rs,num)->{
			Student s=new Student();
			s.setStudentID(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setRnk(rs.getInt(3));
			s.setEmailID(rs.getString(4));
			return s;
		});
		return slist;
 	}

	
	public boolean save(Student s1) {
		int n=jdbctemplate.update("insert into student values(?,?,?,?)",new Object[] {
			s1.getStudentID(),s1.getName(),s1.getRnk(),s1.getEmailID()	
		});
		return n>0;
	}


	@Override
	public Student findById(int studentID) {
		try
		{
		Student s1=jdbctemplate.queryForObject("Select * from student where studentID=?", new Object[] {studentID},BeanPropertyRowMapper.newInstance(Student.class));
		return s1;
		}catch(EmptyResultDataAccessException e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}


	@Override
	public boolean modifyStudent(Student s1) {
		int n=jdbctemplate.update("update student set name=? ,rnk=?,emailID=? where studentID=?",new Object[] {
			s1.getName(),s1.getRnk(),s1.getEmailID(),s1.getStudentID()	
		});
		return n>0;
	}


	@Override
	public boolean removeById(int studentID) {
		int n=jdbctemplate.update("delete from student where studentID=?",new Object[] {studentID});
		return false;
	}
	
	
	

}
