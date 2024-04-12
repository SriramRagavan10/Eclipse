package conditions;

public class Library {
	public static void main(String[]args) {
		int a=25;
		if (a>=1&&a<=5) {
			System.out.println("Fine Rs="+2*a);
		}
		else if (a>=6&&a<=10) {
			System.out.println("Fine Rs="+5*a);
		}
		else if (a>=11&&a<=30) {
			System.out.println("Fine Rs="+7*a);
		}
		else {
			System.out.println("Membership will be Cancelled");
		}
	}

}
