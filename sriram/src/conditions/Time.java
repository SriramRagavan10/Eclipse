package conditions;

public class Time {
	public static void main(String[]args) {
		int t=18;
		if (t>=6&&t<12) {
			System.out.println("Good Morning");
		}
		else if(t>=12&&t<16) {
			System.out.println("Good Afternoon");
		}
		else if (t>=16&&t<19) {
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}

}
