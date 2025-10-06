
public class MyParent {
	private int pid;
	public MyParent(){
		pid=10;
	}
  static class MyChild{
	  private int cid;
	  public MyChild() {
		  cid=100;
	  }
	  public void m1() {
		  System.out.println("in child m1 method");
	  }
	  
  }
}
