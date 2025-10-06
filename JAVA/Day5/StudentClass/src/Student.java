	import java.util.Date;

	public class Student {
		private int id;
		private String name;
	    private float m1;
	    private float m2;
	    private Date bdate;
	    
	    
	    public Student() {
	    	
	    	id=0;
	    	name=null;
	    	m1=0.0f;
	    	m2=0.0f;
	    	bdate=null;
	    }
	    
	    public Student(int id,String nm,float m1,float m2,Date bdt) {
	    	
	    	this.id=id;
	    	name=nm;
	    	this.m1=m1;
	    	this.m2=m2;
	    	bdate=bdt;
	    }
	    
	    public void setId(int id) {
	    	this.id=id;
	    }
	    public void setName(String s) {
	    	this.name=s;
	    }
	    public void setM1(float m1) {
	    	this.m1=m1;
	    }
	    public void setM2(float m2) {
	    	this.m2=m2;
	    }
	    public void setBDate(Date d) {
	    	this.bdate=d;
	    }
	    
	    //getter methods
	    public int getId() {
	    	return id;
	    }
	    public String getName() {
	    	return name;
	    }
	    public float getM1() {
	    	return m1;
	    }
	    public float getM2() {
	    	return m2;
	    }
	    public Date getBDate() {
	    	return bdate;
	    }
	 
	  public String toString() {
	    	return "Id: "+id+" Name: "+name+" M1:"+m1+" M2:"+m2+" Bdate:"+bdate;
	    }
	    
	    
}

	


