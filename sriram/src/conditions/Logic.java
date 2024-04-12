package conditions;

public class Logic {
	public static void main (String[]args) {
		int a=6;
		if(a%2==0 && a%3==0) {
			System.out.println(a+" is Divisible");
		}
		else {
			System.out.println(a+" is Not Divisible");
		}
		int a1=27;
		if(a1%6==0 || a1%9==0) {
			System.out.println(a1+" is Divisible");
		}
		else {
			System.out.println(a1+" is Not Divisible");
		}
	}

}
