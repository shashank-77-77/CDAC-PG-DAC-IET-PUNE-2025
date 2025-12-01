package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	  @Id
      private int pid;
      private String pname;
      private LocalDate startdate;
      @ManyToMany(mappedBy="pset",cascade=CascadeType.ALL)
      Set<Employee> eset;
	public Project() {
		super();
	}
	public Project(int pid, String pname, LocalDate startdate, Set<Employee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.startdate = startdate;
		this.eset = eset;
	}
	
	
	public Project(int pid, String pname, LocalDate startdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.startdate = startdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", startdate=" + startdate + ", eset=" + eset + "]";
	}
      
      
}
