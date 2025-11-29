package com.demo.bean;

public class MyUser {
    private String uname;
    private String email;
    private String role;
	public MyUser() {
		super();
	}
	public MyUser(String uname, String email, String role) {
		super();
		this.uname = uname;
		this.email = email;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", email=" + email + ", role=" + role + "]";
	}
    
}
