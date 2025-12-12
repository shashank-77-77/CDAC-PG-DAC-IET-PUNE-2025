package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	List<Student> getAllStudent();

	boolean addStudent(Student s1);

	Student getById(int studentID);

	boolean updatestudent(Student s1);

	boolean deleteById(int studentID);

}
