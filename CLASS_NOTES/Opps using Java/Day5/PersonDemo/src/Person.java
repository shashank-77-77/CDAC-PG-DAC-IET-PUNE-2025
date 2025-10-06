
public class Person {
	private int pid;
	private String pname;
	static int cnt;
	static {
		cnt=0;
	}
	//private final int c=10;
	private final int c;
	public Person() {
		super();
		cnt++;
		pid=cnt;
		c=10;
	}
	public Person( String pname) {
		super();
		cnt++;
		this.pid = cnt;
		this.pname = pname;
		this.c=23;
		
	}
	public int getPid() {
		return pid;
	}
	/*public void setPid(int pid) {
		this.pid = pid;
	}*/
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Person.cnt = cnt;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", c=" + c + "]";
	}
	
	
	

}
