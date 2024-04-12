package day2;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.brand="reynolds";
		pen1.price=5;
		pen1.color="blue";
		Pen pen2=new Pen();
		pen2.brand="parker";
		pen2.price=25;
		pen2.color="black";
		String b1=pen1.brand.toUpperCase();
		String b2=pen2.brand.toUpperCase();
		boolean a1=pen1.brand.contains("o");
		boolean a2=pen2.brand.contains("m");
		boolean c1=pen1.color.equals("BLUE");
		boolean c2=pen2.color.equals("black");
		char d1=pen1.color.charAt(2);
		char d2=pen2.color.charAt(4);
		String[] p1=pen1.brand.split("n");
		int l1=pen1.color.length();
		int l2=pen2.color.length();
		System.out.println(b1+" "+b2+"\n"+a1+" "+a2+"\n"+c1+" "+c2+"\n"+d1+" "+d2+"\n"+p1[0]+"\n"+l1+" "+l2);
		
	}

}
