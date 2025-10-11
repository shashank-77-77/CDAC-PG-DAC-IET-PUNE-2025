package com.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Student;

public class StudentDaoImpl implements StudentDao {
	static List<Student> slist;
	static {
		slist = new ArrayList<>();
		slist.add(new Student(1, "Soham", Arrays.asList(85, 60, 70)));
		slist.add(new Student(2,"Shashank",Arrays.asList(66,88,45)));
		slist.add(new Student(3,"Akshay",Arrays.asList(45,49,52)));
	}

	@Override
	public boolean save(Student s) {
		slist.add(s);
		return true;
	}

	@Override
	public List<Student> displayAll() {
		return slist;
	}

	@Override
	public Student findById(int id) {
		int pos = slist.indexOf(new Student(id));
		if (pos != -1) {
			return slist.get(pos);
		}
		return null;
	}

	@Override
	public List<Student> findByName(String nm) {
		List<Student> s = slist.stream().filter(stud -> stud.getS_name().equals(nm)).collect(Collectors.toList());
		if (s.size() > 0) {
			return s;
		}
		return null;
	}

	@Override
	public Student updatedMarks(List<Integer> marks) {
		int pos = slist.indexOf(new Student(marks));
		return null;
	}

}