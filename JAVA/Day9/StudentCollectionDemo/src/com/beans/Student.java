package com.beans;

public class Student {
	private int sid;
	private String sname;
	private int age;
	private float m1;
	private float m2;
	
	public Student()
	{
		System.out.println("In default constructor");
	}
	public Student(int sid,String sname,int age,float m1,float m2)
	{
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		this.m1=m1;
		this.m2=m2;
	}
	
	public int getSid()
	{
		return sid;
	}
	
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public float getM1()
	{
		return m1;
	}
	
	public void setM1(float m1)
	{
		this.m1=m1;
	}
	
	public float getM2()
	{
		return m2;
	}
	public void setM2(float m2)
	{
		this.m2=m2;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", m1=" + m1 + ", m2=" + m2 + "]";
	}

}
