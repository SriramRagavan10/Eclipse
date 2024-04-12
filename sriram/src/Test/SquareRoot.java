package Test;

public class SquareRoot {
	public static void main(String[] args) {
		int num = 9;
		double a;
		double sqr = num/2;
		do {
			a = sqr;
			sqr = (a+(num/a))/2;
		}
		while((a - sqr)!= 0);
		System.out.println(sqr);
	}

}
