import java.util.Scanner;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	static {
		tarr=new Team[20];
		Player[] plst= new Player[15];
		plst[0]=new Player(11,"Virat Kohali","Batsman");
		plst[1]=new Player(12,"Rohit Sharma","Batsman");
		plst[2]=new Player(13,"Hardik Pandya","Allrounder");
		Player c=new Player(11,"Rohit Sharma","Batsman");
		tarr[0]=new Team(101,"MI",c,plst,3);
		
		Player[] plst1= new Player[15];
		plst1[0]=new Player(16,"Dravid","Batsman");
		plst1[1]=new Player(17,"Saurabh","Batsman");
		plst1[2]=new Player(18,"Sachin","Allrounder");
		Player c1=new Player(11,"Sachin","Allrounder");
		tarr[1]=new Team(100,"RCB",c1,plst1,3);
		
		cnt=2;
		
	}
	public static boolean addNewTeam() {
		Scanner sc=new Scanner(System.in);
		if(cnt!=20) {
				//team details
				System.out.println("enter tid");
				int tid=sc.nextInt();
				System.out.println("enter team name");
				String tnm=sc.next();
				
				//captain
				System.out.println("enter captain player id");
				int pid=sc.nextInt();
				System.out.println("enter captain player name");
				String pnm=sc.next();
				System.out.println("enter captain player speciality");
				String sp=sc.next();
				Player c=new Player(pid,pnm,sp);
				//loop for creating player list
				Player[] plst=new Player[15];
				plst[0]=c;
				int i=1;
				String ans="y";
				do {
				System.out.println("enter player id");
				 pid=sc.nextInt();
				System.out.println("enter player name");
				 pnm=sc.next();
				System.out.println("enter player speciality");
			   sp=sc.next();
				plst[i]=new Player(pid,pnm,sp);
				i++;
				System.out.println("Do you want to add more(y/n)");
				 ans=sc.next();
				}while(ans.equals("y"));
				
				//add team object in the tarr at cnt position
				tarr[cnt]=new Team(tid,tnm,c,plst,i);
				cnt++;
				return true;
		}
		return false;
	}
	public static void displayAll() {
		for(Team t:tarr) {
			if (t!=null)
			{
				System.out.println(t);
			}else {
				break;
			}
		}
		
	}
	public static Team findById(int tid) {
		for(Team t:tarr) {
			if(t!=null) {
				if(t.getTid()==tid)
					return t;
			}else {
				break;
			}
		}
		return null;
	}
	
	public static boolean addNewPlayer(int tid, int pid, String pnm, String sp) {
		Team t=findById(tid);
		if(t!=null) {
			Player p=new Player(pid,pnm,sp);
			int s=t.getSize();
			//adding player in player list of team
			t.getPlist()[s]=p;
			t.setSize(s+1);
			return true;
			
		}
		
		return false;
	}
	public static Team findTeamByplayer(int pid) {
		for(Team t:tarr) {
			if(t!=null) {
				//retrieve player array from team
				Player[] plst=t.getPlist();
				for(Player p:plst) {
					if(p!=null) {
						if(p.getPid()==pid) {
							return t;
						}
					}else {
						break;
					}
				}
			}else {
				break;
			}
		}
		return null;
	}

}
