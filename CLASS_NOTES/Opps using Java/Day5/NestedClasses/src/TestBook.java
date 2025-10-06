

public class TestBook {

	public static void main(String[] args) {
		Book b1=new Book();
		Book.Lesson l1=b1.new Lesson();
		l1.m1();
		//Book.Lesson l1=b1.new Lesson();
		Book b2=new Book(11,"testing",34,"lesson1");
		System.out.println(b1);
		b2.getL1().m1();
	}

}
