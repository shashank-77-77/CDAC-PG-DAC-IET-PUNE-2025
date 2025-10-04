
public class HelloWorld {
	public static int addNumbers(int a,int b) {
		
		return a+b;
	}
	public static boolean isPrime(int num) {
		for(int i=2; i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("Addition :"+addNumbers(5,6));
		System.out.println(args.length);
		System.out.println(args[0]);
		if(isPrime(Integer.parseInt(args[1]))) {
			System.out.println("the number is prime"+args[1]);
		}else {
			System.out.println("the number is not prime"+args[1]);
		}
	}

}
