
	package com.services;

	import java.util.List;

	import com.beans.Student;

	public interface StudentServices {

		boolean addNewStudent();

		List<Student> displayAll();

		Student searchById(int id);

		List<Student> seachByName(String nm);

		Student updatedMarks(List<Integer> marks);

	}

