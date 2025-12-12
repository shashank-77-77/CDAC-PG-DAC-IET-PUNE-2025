package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao{

	List<Student> findAllStudent();

	boolean save(Student s1);

	Student findById(int studentID);

	boolean modifyStudent(Student s1);

	boolean removeById(int studentID);

}
