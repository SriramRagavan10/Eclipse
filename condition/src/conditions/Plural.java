package conditions;

public class Plural {
	public static void main(String[]args) {
		String[] a= {"PENS","BALL","MAN"};
		if(a[0].endsWith("S")) {
			System.out.println("PLURAL");
		}
		else {
			System.out.println("SINGULAR");
		}
		if(a[1].endsWith("S")) {
			System.out.println("PLURAL");
		}
		else {
			System.out.println("SINGULAR");
		}
		if(a[2].endsWith("S")) {
			System.out.println("PLURAL");
		}
		else {
			System.out.println("SINGULAR");
		}
	}

}
