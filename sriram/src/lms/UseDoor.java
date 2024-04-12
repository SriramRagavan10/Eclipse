package lms;

public class UseDoor {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		Door d=new Door();
		d.colour=a[0].toUpperCase();
		d.materialType=a[1].toUpperCase();
		d.isSmartLockType=Boolean.parseBoolean(a[2]);
		int l=a[0].length()+a[1].length();
		System.out.println("COLOUR="+d.colour+", "+"MATERIAL TYPE="+d.materialType+", "+"SMARTLOCK TYPE="+d.isSmartLockType+", "+"TOTEL LENGTH="+l);
	}

}
