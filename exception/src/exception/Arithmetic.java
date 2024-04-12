package exception;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		System.out.println("Thank You");
		}
		catch(ArithmeticException ae) {
			System.out.println("Error Occurred");
			System.out.println(ae);
			ae.printStackTrace();
		}
	}

}
