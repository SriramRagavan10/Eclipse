package day1;

public class Notetype {
	public static void main(String[]args) {
		Note n1=new Note();
		n1.brand="Classmate";
		n1.type='R';
		n1.pages=100;
		n1.price=60;
		n1.taxAmount=4;
		n1.netprice=n1.price+n1.taxAmount;
		Note n2=new Note();
		n2.brand="Flair";
		n2.type='R';
		n2.pages=100;
		n2.price=60;
		n2.taxPercentage=20;
		n2.taxAmount=n2.price*n2.taxPercentage/100;
		n2.netprice=n2.price+n2.taxAmount;
		Note n3=new Note();
		n3.brand="Class";
		n3.type='U';
		n3.pages=180;
		n3.price=70;
		n3.discountAmount=5;
		n3.netprice=n3.price-n3.discountAmount;
		Note n4=new Note();
		n4.brand="Mate";
		n4.type='U';
		n4.pages=180;
		n4.price=75;
		n4.discountPercentage=10;
		n4.discountAmount=n4.price*n4.discountPercentage/100;
		n4.netprice=n4.price-n4.discountAmount;
		Note n5=new Note();
		n5.brand="NAT";
		n5.type='R';
		n5.pages=200;
		n5.price=80;
		n5.taxAmount=8;
		n5.discountAmount=10;
		n5.netprice=n5.price+n5.taxAmount-n5.discountAmount;
		int total=n1.netprice+n2.netprice+n3.netprice+n4.netprice+n5.netprice;
		int average=total/5;
		System.out.println(n1.brand+","+n1.type+","+n1.pages+","+n1.netprice+"\n"+n2.brand+","+n2.type+","+n2.pages+","+n2.netprice+"\n"+n3.brand+","+n3.type+","+n3.pages+","+n3.netprice+"\n"+n4.brand+","+n4.type+","+n4.pages+","+n4.netprice+"\n"+n5.brand+","+n5.type+","+n5.pages+","+n5.netprice+"\n"+"\n"+"\n"+average);
	}

}
