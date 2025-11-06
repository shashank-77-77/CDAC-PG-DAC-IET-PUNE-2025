import java.util.Arrays;

public class Team {
     private int tid;
     private String tname;
     private Player captain;
     private Player[] plist;
     private int size;
	public Team() {
		super();
	}
	
	public Team(int tid, String tname, Player captain, Player[] plist, int size) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.captain = captain;
		this.plist = plist;
		this.size = size;
	}

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)
				+ "]";
	}
     
}
