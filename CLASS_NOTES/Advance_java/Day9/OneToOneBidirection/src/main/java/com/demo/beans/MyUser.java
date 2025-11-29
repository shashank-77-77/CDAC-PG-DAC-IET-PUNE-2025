package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Myuser1")
public class MyUser {
	@Id
	private int uid;
	private String uname;
	private String mob;
	@OneToOne(fetch=FetchType.LAZY) //fetch lazy will avoid join query
	@JoinColumn(name="addrid")  //it is optional, allow to change join column name
	private Address addr;
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
