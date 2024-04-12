package conditions;

public class Natural {
	public static void main(String[]args) {
		int a=65;
		if (a>=20&&a<=40) {
			System.out.println("Work in Anywhere");
		}
		else if(a>40&&a<=60) {
			System.out.println("Work in Urban Areas");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
