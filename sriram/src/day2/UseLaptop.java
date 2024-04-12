package day2;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="hp";
		laptop1.price=66000;
		laptop1.color="Silver";
		laptop1.isWarranty="One Year";
		String b=laptop1.brand.toUpperCase();
		int l=laptop1.brand.length();
		boolean s=laptop1.brand.startsWith("D");
		char c=laptop1.brand.charAt(laptop1.brand.length()-1);
		String c1=laptop1.color.toLowerCase();
		System.out.println(b+"\n"+l+"\n"+s+"\n"+c+"\n"+c1);
		
		
	}

}
