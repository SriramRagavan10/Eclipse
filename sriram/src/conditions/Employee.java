package conditions;

public class Employee {
	public static void main(String[]args) {
		int e=30000;
		if (e>=250000&&e<=500000) {
			System.out.println("Tax Amount= "+e*5/100);
		}
		else if (e>500000&&e<=1000000) {
			System.out.println("Tax Amount= "+e*20/100);
		}
		else if (e>1000000) {
			System.out.println("Tax Amount= "+e*30/100);
		}
		else {
			System.out.println("Not Eligible");
		}
	}

}
