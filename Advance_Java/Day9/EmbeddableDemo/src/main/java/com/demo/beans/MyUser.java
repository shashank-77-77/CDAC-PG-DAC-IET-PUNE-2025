package com.demo.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyUser {
	@Id
	private int uid;
	private String uname;
	private String mob;
	@Embedded
	Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String uname, String mob, Address addr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mob = mob;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mob=" + mob + ", addr=" + addr + "]";
	}
	

}
