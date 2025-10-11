package com.beans;

import java.util.List;
import java.util.Objects;

public class Student {
	private int s_id;
	private String s_name;
	private List<Integer> m;

	public Student(List<Integer> marks) {
		super();
	}

	public Student(int s_id, String s_name, List<Integer> m) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.m = m;
	}
	

	public Student(int id) {
		s_id=id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Integer> getM() {
		return m;
	}

	public void setM(List<Integer> m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ",marks=" + m + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(m, s_id, s_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(m, other.m) && s_id == other.s_id && Objects.equals(s_name, other.s_name);
	}

}