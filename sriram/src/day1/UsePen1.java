package day1;

public class UsePen1 {
	public static void main(String[]args) {
		Pen1 p1=new Pen1();
		p1.brand="Classmate";
		p1.price=20;
		p1.isBlueColor=true;
		p1.tipWidth=1.2f;
		Pen1 p2=new Pen1();
		p2.brand="Reynolds";
		p2.price=30;
		p2.isBlueColor=false;
		p2.tipWidth=1.4f;
		Pen1 p3=new Pen1();
		p3.brand="Parker";
		p3.price=50;
		p3.isBlueColor=true;
		p3.tipWidth=1.5f;
		int total=p1.price+p2.price+p3.price;
		float a=total/3;
		System.out.println(a);
	}

}
