package conditions;

public class Result {
	public static void main(String[]args) {
		int t=35;
		int e=40;
		int m=20;
		int to=t+e+m;
		if (t>=33&&e>=33&&m>=33) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		if (to>=40) {
			System.out.println("Total Pass");
		}
		else {
			System.out.println("Total Fail");
		}
	}

}
