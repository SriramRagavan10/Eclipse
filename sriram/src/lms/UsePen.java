package lms;

public class UsePen {
	public static void main(String[]args) {
		Pen p1=new Pen();
		p1.price=Integer.parseInt(args[0]);
		p1.brand=args[1];
		p1.type=args[2];
		System.out.println(p1.price+","+p1.brand+","+p1.type);
	}

}
