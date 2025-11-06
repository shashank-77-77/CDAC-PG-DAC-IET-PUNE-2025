import java.util.Scanner;

public class TestTeamArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new team\n2. Display all teams\n");
		System.out.println("3. search team by id\n4. Add new player\n");
		System.out.println("5. search a player\n6. exit\nChoice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status=TeamService.addNewTeam();
			if(status)
				System.out.println("team added successfully");
			else
				System.out.println("Error: Team not added");
			break;
		case 2:
			TeamService.displayAll();
			break;
		case 3:
			System.out.println("enter teamid to search");
			int tid=sc.nextInt();
			Team t=TeamService.findById(tid);
			if(t!=null) {
				System.out.println(t);
			}else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enter teamid to add new player");
		    tid=sc.nextInt();
		    System.out.println("add new player id");
		    int pid=sc.nextInt();
		    System.out.println("enter player name");
		    String pnm=sc.next();
		    System.out.println("enter player speciality");
			String sp=sc.next();
			status=TeamService.addNewPlayer(tid,pid,pnm,sp);
			if(status)
				System.out.println("player added successfully");
			else
				System.out.println("Error: Team not found");
			break;
		case 5:
			System.out.println("enter pid to search");
			pid=sc.nextInt();
			Team team=TeamService.findTeamByplayer(pid);
			if(team!=null) {
				System.out.println(team);
			}else {
				System.out.println("player not found");
			}
			break;
		case 6:
			sc.close();
			System.out.println("Thank you for visiting.......");
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
		}while(choice!=6);
	}

}
