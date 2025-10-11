package com.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Student;
import com.dao.StudentDao;
import com.dao.StudentDaoImpl;

public class StudentServicesImpl implements StudentServices {
	private StudentDao s_dao;

	public StudentServicesImpl() {
		super();
		s_dao = new StudentDaoImpl();
	}

	@Override
	public boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("How many marks do you want to enter? ");
		int count = sc.nextInt();

		List<Integer> marks = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter marks for " + (i + 1) + ": ");
			int mark = sc.nextInt();
			marks.add(mark);
		}

		Student s = new Student(id, name, marks);
		return s_dao.save(s);

	}

	@Override
	public List<Student> displayAll() {
		return s_dao.displayAll();
	}

	@Override
	public Student searchById(int id) {
		return s_dao.findById(id);
	}

	@Override
	public List<Student> seachByName(String nm) {
		return s_dao.findByName(nm);
	}

	@Override
	public Student updatedMarks(List<Integer> marks) {
		return s_dao.updatedMarks(marks);
	}

}