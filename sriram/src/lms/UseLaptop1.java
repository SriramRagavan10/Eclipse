package lms;

public class UseLaptop1 {
	public static void main(String[]args) {
		Laptop1 l=new Laptop1();
		String[] x=args[0].split(",");
		String[] a=x[0].split("@");
		l.brand=a[0].toUpperCase();
		l.colour=a[1].toUpperCase();
		l.taxAmount=Integer.parseInt(a[5]);
		l.price=Integer.parseInt(a[2]);
		l.netprice=l.price+l.taxAmount;
		l.displaysize=Float.parseFloat(a[3]);
		l.isTouchScreen=Boolean.parseBoolean(a[4]);
		Laptop1 l1=new Laptop1();
		String[] b=x[1].split("#");
		l1.brand=b[0].toUpperCase();
		l1.colour=b[1].toUpperCase();
		l1.price=Integer.parseInt(b[2]);
		l1.taxPercentage=Integer.parseInt(b[5]);
		l1.taxAmount=l1.price*l1.taxPercentage/100;
		l1.netprice=l1.price+l1.taxAmount;
		l1.displaysize=Float.parseFloat(b[3]);
		l1.isTouchScreen=Boolean.parseBoolean(b[4]);
		char e1=l.brand.charAt(l.brand.length()-1);
		char e2=l1.brand.charAt(0);
		System.out.println(l.brand+" "+l.colour+" "+l.price+" "+l.displaysize+" "+l.isTouchScreen+" "+e1+" "+l.netprice+"\n"+l1.brand+" "+l1.colour+" "+l1.price+" "+l1.displaysize+" "+l1.isTouchScreen+" "+e2+" "+l1.netprice);
		
	}

}
