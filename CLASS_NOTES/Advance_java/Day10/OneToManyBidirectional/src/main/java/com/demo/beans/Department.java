package com.demo.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {
	@Id
	private int deptid;
	private String dname;
	private String dloc;
	@OneToMany(mappedBy="dept")
	Set<Employee> eset;
	public Department() {
		super();
	}
	public Department(int deptid, String dname, String dloc, Set<Employee> eset) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.dloc = dloc;
		this.eset = eset;
	}
	
	public Department(int deptid, String dname, String dloc) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.dloc = dloc;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", dloc=" + dloc + ", eset=" + eset + "]";
	}
	

}
