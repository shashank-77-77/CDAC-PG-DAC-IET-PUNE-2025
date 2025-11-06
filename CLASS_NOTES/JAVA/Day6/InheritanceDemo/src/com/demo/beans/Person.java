package com.demo.beans;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	static int scount,vcount,ccount;
	static {
		scount=0;
		ccount=0;
		vcount=0;
	}
	private String pid;
	private String pname;
	private Date bdate;
	public Person() {
		//this("s",null,null);
		System.out.println("in Person default constrctor");
		
		pid=generateId("s");
		pname=null;
		bdate=null;
		
	}
	public Person(String emptype, String pname, Date bdate) {
		System.out.println("in Person parametrised constructor");
		
		pid=generateId(emptype);
		this.pname = pname;
		this.bdate = bdate;
	}
	
	private String generateId(String emptype) {
		if (emptype.equals("s")) {
			scount++;
			return emptype+scount;
		}else if (emptype.equals("c")) {
			ccount++;
			return emptype+ccount;
		}else if(emptype.equals("v")) {
			vcount++;
			return emptype+vcount;
		}/*else {
			return "cu"+cucount;
		}*/
		return null;
		
	}
		
	public String getPid() {
		return pid;
	}
	/*public void setPid(String pid) {
		this.pid = pid;
	}*/
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(bdate);
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + str + "]";
	}
}
