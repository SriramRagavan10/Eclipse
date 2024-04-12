package conditions;

public class ElseifCondition {
	public static void main (String[]args) {
		int a=30;
		int b=90;
		int c=110;
		if (a>b&&a>c) {
			System.out.println(a+" is bigger");
		}
		else if (b>a&&b>c) {
			System.out.println(b+" is bigger");
		}
		else {
			System.out.println(c+" is bigger");
		}
	}

}
