package for1;

public class ForFibonacciSeries {
	public static void main(String[]args) {
		int a=-1;
		int b=1;
		int c=0;
		int d=0;
		for(int i=0; i<=5; i++) {
			c=a+b;
			a=b;
			b=c;
			d=d+c;
			//System.out.println(c);
		}
			System.out.println(d);
		
	}

}
