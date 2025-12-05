package com.demo.beans;

public class Faculty {
	private int fid;
	private String fname;
	private Skill spskill;
	private Address addr;
	public Faculty() {
		super();
		System.out.println("in faculty default constructor");
	}
	public Faculty(int fid, String fname, Skill spskill, Address addr) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.spskill = spskill;
		this.addr = addr;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Skill getSpskill() {
		return spskill;
	}
	public void setSpskill(Skill spskill) {
		this.spskill = spskill;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", spskill=" + spskill + ", addr=" + addr + "]";
	}
	
	

}
