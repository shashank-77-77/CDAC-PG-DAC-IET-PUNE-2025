
public class TestIPLTeam {

	public static void main(String[] args) {
		Player[] plst= {
				new Player(11,"Virat Kohali","Batsman"),
				new Player(12,"Rohit Sharma","Batsman"),
				new Player(13,"Hardik Pandya","Allrounder")
				
		};
		Player c=new Player(11,"Rohit Sharma","Batsman");
		Team t1=new Team(100,"RCB",c,plst,3);
		System.out.println(t1);

	}

}
