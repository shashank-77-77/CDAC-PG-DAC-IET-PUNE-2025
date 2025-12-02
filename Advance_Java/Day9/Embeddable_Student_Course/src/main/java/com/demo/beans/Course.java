package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	private int cid;
	private String cname;
	@OneToMany(mappedBy="cou")
	Set<Student> sset;
	public Course() {
		super();
	}
	public Course(int cid, String cname, Set<Student> sset) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.sset = sset;
	}
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Student> getSset() {
		return sset;
	}
	public void setSset(Set<Student> sset) {
		this.sset = sset;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", sset=" + sset + "]";
	}
	
	
}
