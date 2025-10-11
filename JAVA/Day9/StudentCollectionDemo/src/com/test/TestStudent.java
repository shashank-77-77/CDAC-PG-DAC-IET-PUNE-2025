package com.test;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import com.beans.*;
	import com.services.StudentServices;
	import com.services.StudentServicesImpl;

	public class TestStudent {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			StudentServices s_services = new StudentServicesImpl();
			int choice;
			do {
				System.out.println("1. add new student\n 2. display all\n3. search by id");
				System.out.println("4. Search by name\n 5. update marks\n6. delete by id\n7. delete by marks\n");
				System.out.println("8. search by marks \n 9. sort by marks\n10. Sort By name\n11. exit\n choice: ");
				choice = sc.nextInt();

				switch (choice) {
				case 1 -> {
					boolean status = s_services.addNewStudent();
					if (status) {
						System.out.println("Data Added Successfully");
					} else {
						System.out.println("Error: something went wrong!!");
					}
				}
				case 2->{
					List<Student> s =s_services.displayAll();
					s.forEach(System.out::println);
				}
				case 3->{
					System.out.print("Enter id to search: ");
					int id=sc.nextInt();
					Student s = s_services.searchById(id);
					if(s!=null) {
						System.out.println(s);
					}else {
						System.out.println("Not Found!!!");
					}
				}
				case 4->{
					System.out.print("Enter name: ");
					String nm = sc.next();
					List<Student> slst = s_services.seachByName(nm);
					if(slst!=null) {
						slst.forEach(System.out::println);
					}else {
						System.out.println("Not Found!!!!");
					}
				}
				case 5->{
					System.out.println("Enter Marks to update.");
					System.out.print("How many marks do you want to enter? ");
					int count = sc.nextInt();
					List<Integer> marks = new ArrayList<>();
					for(int i=0;i<count;i++) {
						System.out.println("Enter marks for " + (i + 1) + ": ");
						int mark = sc.nextInt();
						marks.add(mark);
					}
					
					Student s = s_services.updatedMarks(marks);
					if(s!=null) {
						System.out.println(s);
					}else {
						System.out.println("Not Found!!!");
					}
					
				}
				case 11 -> {
					sc.close();
					System.out.println("Thank ypu for visiting....");
				}
				default -> {
					System.out.println("wrong choice");
				}
				}

			} while (choice != 11);
		}

	}


