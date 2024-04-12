package lms;

public class UseChair {
	public static void main(String[]args) {
		Chair c1=new Chair();
		c1.brand=args[0];
		c1.withHand=Boolean.parseBoolean(args[1]);
		c1.price=Integer.parseInt(args[2]);
		System.out.println("Brand="+c1.brand+", "+"WithHand="+c1.withHand+", "+"Price="+c1.price);
	}

}
