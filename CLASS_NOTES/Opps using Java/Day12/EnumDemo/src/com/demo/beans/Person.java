package com.demo.beans;

import com.demo.enums.Gender;

public class Person {
  private int pid;
  private String pname;
  private Gender gender;
public Person() {
	super();
}
public Person(int pid, String pname, Gender gender) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.gender = gender;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", pname=" + pname + ", gender=" + gender + "]";
}
  
  
}
