import java.util.Date;

public class Student {
	private int id;
	private String name;
    private float m1;
    private float m2;
    private Date bdate;
    
    //default constructor 
    public Student() {
    	System.out.println("In student default constructor");
    	id=0;
    	name=null;
    	m1=0.0f;
    	m2=0.0f;
    	bdate=null;
    }
    
    //parametrised constructor
    //1 implicit(this) 5 explicit
    public Student(int id,String nm,float m1,float m2,Date bdt) {
    	System.out.println("In student parametrised constructor");
    	this.id=id;
    	name=nm;
    	this.m1=m1;
    	this.m2=m2;
    	bdate=bdt;
    }
    
    //setter methods
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
    //1 implicit (this) 0 explicit
   /* public void display() {
    	System.out.println("Id : "+this.id);
    	System.out.println("Name : "+this.name);
    	System.out.println("M1 : "+m1);
    	System.out.println("M2 : "+m2);
    	System.out.println("BirthDate  : "+bdate);
    }*/
    
  public String toString() {
    	System.out.println("tostring method of student called");
    	return "Id: "+id+" Name: "+name+" M1:"+m1+" M2:"+m2+" Bdate:"+bdate;
    }
    
    
}
