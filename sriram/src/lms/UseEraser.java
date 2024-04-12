package lms;

public class UseEraser {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		Eraser e1=new Eraser();
		e1.brand=a[0].toUpperCase();
		e1.price=Integer.parseInt(a[1]);
		e1.quality=Boolean.parseBoolean(a[2]);
		int l=a[0].length();
		char c=e1.brand.charAt(1);
		System.out.println("Brand - "+e1.brand+", "+"Price - "+e1.price+", "+"Quality - "+e1.quality+", "+"Length - "+l+", "+"Second Letter - "+c);
		
	}
	
}
