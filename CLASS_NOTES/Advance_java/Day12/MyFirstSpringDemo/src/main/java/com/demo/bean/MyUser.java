package com.demo.bean;

public class MyUser {
	
	private int uid;
	private String uname;
	private String email;
	private Address addr;
	public MyUser() {
		super();
		System.out.println("in MyUser default constructor");
	}
	public MyUser(int uid, String uname, String email, Address addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.addr = addr;
		System.out.println("in MyUser parametrized constructor");
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
		System.out.println("in MyUser setuid");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("in MyUser setuname");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		System.out.println("in MyUser setemail");
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
		System.out.println("in MyUser setaddress");
	}
	
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", email=" + email + ", addr=" + addr + "]";
	}
	

}
