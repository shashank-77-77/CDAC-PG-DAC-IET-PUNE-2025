package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;

@Service 
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao sdao;

	public List<Student> getAllStudent() {
		return sdao.findAllStudent();
	}

	public boolean addStudent(Student s1) {
		return sdao.save(s1);
	}

	@Override
	public Student getById(int studentID) {
		return sdao.findById(studentID);
	}

	@Override
	public boolean updatestudent(Student s1) {
		return sdao.modifyStudent(s1);
	}

	@Override
	public boolean deleteById(int studentID) {
		return sdao.removeById(studentID);
	}
	
	

}
