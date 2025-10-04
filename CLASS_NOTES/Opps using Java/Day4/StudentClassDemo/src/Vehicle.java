import java.util.Date;

public class Vehicle {
   private int vid;
   private String oname;
   private String vtype;
   private Date dpurchase;
   
   public Vehicle() {
	   vid=0;
	   oname=null;
	   vtype=null;
	   dpurchase=null;
   }
   
   public Vehicle(int id,String nm,String type,Date dt) {
	   vid=id;
	   oname=nm;
	   vtype=type;
	   dpurchase=dt;
	   
   }
   
   public void setVid(int id) {
	   vid=id;
   }
   
   public void setOname(String nm) {
	   oname=nm;
   }
   
   public void setVtype(String ty) {
	   vtype=ty;
   }
   
   public void setDpurchase(Date dt) {
	   dpurchase=dt;
   }
   
   public int getVid() {
	   return vid;
   }
   public String getOname() {
	   return oname;
   }
   public String getVtype() {
	   return vtype;
   }
   public Date getDpurchase() {
	   return dpurchase;
   }
   
   public String toString() {
	   return "Id: "+vid+" Name: "+oname+" type: "+vtype+"Date : "+dpurchase;
   }
   
   
}
