import java.util.Scanner;
public class TeamService {
static Teams[] tarr;
	static int cnt;
	static
	{
		tarr= new Teams[10];
		Player[] plist= new Player[10];
		plist[0] = new Player(7,"Ronaldo","Striker");
		plist[1] = new Player(10,"Messi","AllRounder");
		plist[2] = new Player(9,"Ronaldino","Keeper");
		
		Player cap= new Player(7,"Ronaldo","Striker");
		
		tarr[0] = new Teams(42,"Portugal",cap,plist,3);
		
		
	
		Player[] plist1= new Player[10];
		plist1[0] = new Player(7,"Neymar","Striker");
		plist1[1] = new Player(10,"Messi","AllRounder");
		plist1[2] = new Player(9,"Marcello","Keeper");
		plist1[3] = new Player(12,"BruceLee","Keeper");
		
		Player cap1= new Player(10,"Messi","Striker");
		
		tarr[1] = new Teams(99,"Brazil",cap1,plist1,4);
		
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
				Player[] plist=new Player[10];
				plist[0]=c;
				int i=1;
				String ans="y";
				do {
				System.out.println("enter player id");
				 pid=sc.nextInt();
				System.out.println("enter player name");
				 pnm=sc.next();
				System.out.println("enter player speciality");
			   sp=sc.next();
				plist[i]=new Player(pid,pnm,sp);
				i++;
				System.out.println("Do you want to add more(y/n)");
				 ans=sc.next();
				}while(ans.equals("y"));
				
				//add team object in the tarr at cnt position
				tarr[cnt]=new Teams(tid,tnm,c,plist,i);
				cnt++;
				return true;
		}
		return false;
	}
	public static void displayAll() {
		for(Teams t:tarr) {
			if (t!=null)
			{
				System.out.println(t);
			}else {
				break;
			}
		}
		
	}
	public static Teams findById(int tid) {
		for(Teams t:tarr) {
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
		Teams t=findById(tid);
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
	public static Teams findTeamByplayer(int pid) {
		for(Teams t:tarr) {
			if(t!=null) {
				//retrieve player array from team
				Player[] plist=t.getPlist();
				for(Player p:plist) {
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


