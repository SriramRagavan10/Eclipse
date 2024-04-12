package conditions;

public class QuadraticEquation {
	public static void main(String[]args) {
		int a=1;
		int b=5;
		int c=2;
		float d=b*b-4.51f*a*c;
		if (d>0) {
			System.out.println("The Roots are= "+d);
		}
		else {
			System.out.println("The Not Roots are= "+d);
		}
	}

}
