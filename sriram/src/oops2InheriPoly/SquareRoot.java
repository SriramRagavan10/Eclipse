package oops2InheriPoly;

public class SquareRoot {
	public static void main(String[] args) {
		int num = 49;
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
