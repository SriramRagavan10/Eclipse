package lms;

public class UseMobile {
	public static void main(String[]args) {
		Mobile m=new Mobile();
		m.price=Integer.parseInt(args[0]);
		m.brand=args[1];
		m.model=args[2];
		System.out.println("Price="+m.price+","+"Brand="+m.brand+","+"Model="+m.model);
		
	}

}
