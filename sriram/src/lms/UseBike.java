package lms;

public class UseBike {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		Bike b=new Bike();
		b.brand=a[0];
		b.model=a[1];
		b.price=Integer.parseInt(a[2]);
		b.taxAmount=Integer.parseInt(a[3]);
		b.netPrice=b.price+b.taxAmount;
		System.out.println(b.brand+","+b.netPrice);
	}

}
