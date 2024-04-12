package day1;

public class UsePen {
	public static void main(String[]args) {
		Pen a1=new Pen();
		a1.colour="Blue";
		a1.brand="Flair";
		a1.price=40;
		a1.taxAmount=4;
		a1.netprice=a1.price+a1.taxAmount;
		Pen a2=new Pen();
		a2.colour="Red";
		a2.brand="Natraj";
		a2.price=45;
		a2.taxpercentage=10;
		a2.taxAmount=a2.price*a2.taxpercentage/100;
		a2.netprice=a2.price+a2.taxAmount;
		System.out.println(a1.colour+"\n"+a1.brand+"\n"+a1.price+"\n"+a1.netprice+"\n"+a2.colour+"\n"+a2.brand+"\n"+a2.price+"\n"+a2.netprice);
	}

}
