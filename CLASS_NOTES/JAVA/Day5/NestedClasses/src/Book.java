
public class Book {
   private int bid;
   private String bname;
   private Lesson l1; 
   class Lesson{
	   private int lid;
	   private String lname;
	   public Lesson() {
		   lid=0;
		   lname=null;
	   }
	   public Lesson(int id,String nm) {
		   lid=id;
		   lname=nm;
		   
	   }
	   public void m1() {
		   System.out.println("in m1 method of lesson");
		   
	   }
   }
   
   public Book() {
	   bid=0;
	   bname=null;
	   l1=null;
   }
   
   public Book(int bid,String bname,int lid,String lname) {
	   this.bid=bid;
	   this.bname=bname;
	   this.l1=new Lesson(lid,lname);
	   
	   
   }
   
   public Lesson getL1(){
	   return l1;
   }
   public String toString() {
	   return bid+","+bname;
   }
}
