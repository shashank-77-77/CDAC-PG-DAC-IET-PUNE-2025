package com.demo.beans;

public class MyUSer {
	private String uname;
	private String passwd;
	private String role;
	public MyUSer() {
		super();
	}
	public MyUSer(String uname, String passwd, String role) {
		super();
		this.uname = uname;
		this.passwd = passwd;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUSer [uname=" + uname + ", passwd=" + passwd + ", role=" + role + "]";
	}
	

}
