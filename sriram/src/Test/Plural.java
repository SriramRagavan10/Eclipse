package Test;

public class Plural {
	public static void main(String[]args) {
		String[] a= {"Pens","Car","Bikes"};
		if(a[0].endsWith("s") || a[1].endsWith("s") || a[2].endsWith("s")) {
			System.out.println("Plural");
		}
		else {
			System.out.println("Singular");
		}
	}

}
