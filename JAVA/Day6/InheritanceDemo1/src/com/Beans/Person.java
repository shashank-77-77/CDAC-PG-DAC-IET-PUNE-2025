package com.Beans;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	static int scount,ccount,vcount;
	static {
		scount=0;
		ccount=0;
		vcount=0;
	}
	private String pid;
	private String pname;
	private Date bdate;
	
	public Person()
	{
		pid=generateId("s");
		pname=null;
		bdate=null;
	}
	public Person(String emptype ,String pname,Date bdate)
	{
		pid=generateId(emptype);
		this.pname=pname;
		this.bdate=bdate;
	}
	
	private String generateId(String emptype)
	{
		if (emptype.equals("s")) {
			scount++;
			return emptype+scount;
		}else if (emptype.equals("c")) {
			ccount++;
			return emptype+ccount;
		}else if(emptype.equals("v")) {
			vcount++;
			return emptype+vcount;
		}
		
		return null;
		
	}
	public String getPid() {
		return pid;
	}
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
	
	public String toString()
	{
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(bdate);
		return"Person [pid =" + pid + ", pname=" + pname +", bdate= "+str+"]";
			
	}
}
	


