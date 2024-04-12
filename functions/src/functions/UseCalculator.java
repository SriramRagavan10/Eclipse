package functions;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator n=new Calculator();
		System.out.println(n.add());
		System.out.println(n.subtract(35, 6));
		n.multiply();
		n.divide(100, 5);
	}

}
