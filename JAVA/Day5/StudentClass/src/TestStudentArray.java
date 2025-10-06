
	import java.util.Scanner;

	public class TestStudentArray {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int choice=0;
			do {
			System.out.println("1. add new student\n2. display all\n3. search by id");
			System.out.println("4. search by name\n5. update marks\n6.exit\nchoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				boolean status=StudentService.addNewStudent();
				if(status) {
					System.out.println("Student added successfuly");
				}else {
					System.out.println("error: Not added");
				}
				
				break;
			case 2:
				StudentService.displayAll();
				break;
			case 3:
				System.out.println("Enter id to search");
				int id=sc.nextInt();
				Student stud=StudentService.SearchById(id);
				if(stud != null)
				{
					System.out.println(stud);
				}
				else
				{
					System.out.println("Student not found");
				}
				break;
			case 4:
				System.out.println("Enter name to search");
				String s1=sc.next();
				stud=StudentService.SearchByName(s1);
				if(stud != null)
				{
					System.out.println(stud);
				}
				else
				{
					System.out.println("Student not found");
				}
				break;
			case 5:
				System.out.println("Enter id of student to update marks");
				id=sc.nextInt();
				System.out.println("Enter m1 marks to update");
				float m1=sc.nextFloat();
				System.out.println("Enter m2 marks to update");
				float m2=sc.nextFloat();
				stud=StudentService.UpdateMarks(m1,m2,id);
				if(stud != null)
				{
					System.out.println(stud);
				}
				else
				{
					System.out.println("Marks not updated");
				}
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
			default:
				System.out.println("wrong choice");
				
			}
			}while(choice!=6);

		}

	}

