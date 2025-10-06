
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;

	public class StudentService {
	   static Student[] studarr;
	   static int cnt;
	   static {
		   studarr=new Student[100];
		   studarr[0]=new Student(11,"Soham",98,97,new Date(2000-05-12));
		   studarr[1]=new Student(12,"Shashank",98,97,new Date(1999-11-9));
		   studarr[2]=new Student(13,"Yuvraj",98,97,new Date(2003-10-22));
		   cnt=3;
	   }
	public static boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter marks1");
		float m1=sc.nextFloat();
		System.out.println("enter marks2");
		float m2=sc.nextFloat();
		System.out.println("enter birth date(dd/mm/yyyy)");
		String dt=sc.next();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date bdt=null;
		try {
			bdt=sdf.parse(dt);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		Student s=new Student(sid,nm,m1,m2,bdt);
		if(cnt==studarr.length) {
			return false;
		}else {
			studarr[cnt]=s;
			cnt++;
			return true;
		}
		
	}
	public static void displayAll() {

		for(int i=0;i<cnt;i++) {
			System.out.println(studarr[i]);
		}
		
		
	}
	
	public static Student SearchById(int idd) {
//		for(int i=0;i<cnt;i++) {
//			if(studarr[i] != null)
//			{
//				System.out.println("in if null");
//				if(studarr[i].getId()==idd)
//				{
//					System.out.println("In if getid");
//					
//					return studarr[i];
//				}
//				else
//				{
//					System.out.println("in else");
//					break;
//				}
//			}
//		}
		for(Student s: studarr)
		{
			if(s != null)
			{
				if(s.getId()==idd)
				{
					return s;
				}
				else
				{
					break;
				}
			}
		}
		
		return null;
	}
	public static Student SearchByName(String s1) {
		for(Student s:studarr)
		{
			if(s != null)
			{
				if(s.getName().equals(s1))
				{
					return s;
				}
				else
				{
					break;
				}
			}
		}
		return null;
	}
	public static Student UpdateMarks(float m1, float m2,int id) {
		for(Student s: studarr)
		{
			if(s != null)
			{
				if(s.getId()==id)
				{
					
				}
				else
				{
					break;
				}
			}
		}
		for(Student s1:studarr)
		{
			if(s1 != null)
			{
				if(s1.getId()==id)
				{
				s1.setM1(m1);
				s1.setM2(m2);
				return s1;
				}
			}
			else
			{
				break;
			}
		}
		return null;
	}
	
	
}



