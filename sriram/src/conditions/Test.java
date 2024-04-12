package conditions;

public class Test {
	public static void main(String[]args) {
		String a="South";
		if(a.charAt(0)=='N') {
			System.out.println("North");
		}
		else if(a.charAt(0)=='S') {
			System.out.println("South");
		}
		else if(a.charAt(0)=='E') {
			System.out.println("East");
		}
		else if(a.charAt(0)=='W') {
			System.out.println("West");
		}
	}

}
