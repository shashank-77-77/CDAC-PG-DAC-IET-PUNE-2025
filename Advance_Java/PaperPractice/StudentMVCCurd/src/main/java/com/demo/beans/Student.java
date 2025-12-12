package com.demo.beans;

public class Student {
	private int studentID; 
	private String name;
	private int rnk; 
	private String emailID;
	public Student() {
		super();
	}
	public Student(int studentID, String name, int rnk, String emailID) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.rnk = rnk;
		this.emailID = emailID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRnk() {
		return rnk;
	}
	public void setRnk(int rnk) {
		this.rnk = rnk;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", rnk=" + rnk + ", emailID=" + emailID + "]";
	}

	
}
