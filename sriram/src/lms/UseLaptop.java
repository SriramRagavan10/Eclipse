package lms;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop l=new Laptop();
		String[] a=args[0].split("@");
		l.brand=a[0];
		l.colour=a[1];
		l.price=Integer.parseInt(a[2]);
		l.discountAmount=Integer.parseInt(a[5]);
		l.netprice=l.price-l.discountAmount;
		l.displaysize=Float.parseFloat(a[3]);
		l.isTouchScreen=Boolean.parseBoolean(a[4]);
		Laptop l1=new Laptop();
		String[] b=args[1].split("#");
		l1.brand=b[0];
		l1.colour=b[1];
		l1.price=Integer.parseInt(b[2]);
		l1.discountPercentage=Integer.parseInt(b[5]);
		l1.discountAmount=l1.price*l1.discountPercentage/100;
		l1.netprice=l1.price-l1.discountAmount;
		l1.displaysize=Float.parseFloat(b[3]);
		l1.isTouchScreen=Boolean.parseBoolean(b[4]);
		System.out.println(l.brand+" "+l.colour+" "+l.price+" "+l.displaysize+" "+l.isTouchScreen+" "+l.netprice+"\n"+l1.brand+" "+l1.colour+" "+l1.price+" "+l1.displaysize+" "+l1.isTouchScreen+" "+l1.netprice);
		
	}

}
