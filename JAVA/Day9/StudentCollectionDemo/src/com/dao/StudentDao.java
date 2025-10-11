package com.dao;

import java.util.List;

import com.beans.Student;

public interface StudentDao {

	boolean save(Student s);

	List<Student> displayAll();

	Student findById(int id);

	List<Student> findByName(String nm);

	Student updatedMarks(List<Integer> marks);



}