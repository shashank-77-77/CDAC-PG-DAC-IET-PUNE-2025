import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student(12,"Rajan",98,97,new Date(2022,11,23));
		//s1.display();
		
		System.out.println(s1);
		Student s2=new Student(13,"Revati",98,97,new Date(2019,11,25));
		//s2.display();
		
		System.out.println(s2);  //calls toString method
		s1.setId(10);
		//s1.display();
        System.out.println("id: "+s1.getId());     
	
	}

}
