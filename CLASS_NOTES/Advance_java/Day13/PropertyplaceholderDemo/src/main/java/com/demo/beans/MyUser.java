package com.demo.beans;

public class MyUser {
	private int uid;
	private String name;
	private String addr;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String name, String addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", name=" + name + ", addr=" + addr + "]";
	}
	

}
