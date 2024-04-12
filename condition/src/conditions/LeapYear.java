package conditions;

public class LeapYear {
	public static void main(String[]args) {
		int a=2032;
		if(a%4==0) {
			System.out.println(a+" is Leap Year");
		}
		else {
			System.out.println(a+" is Not a Leap Year");
		}
	}

}
