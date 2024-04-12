package Test;

public class ForSquareRoot {
	public static void main(String[] args) {
		int a=9;
		int num=a;
		int c=0;
		int b=0;
		for(int i=1; i<a; i++) {
			if(i*i==a) {
				c++;
				break;
			}
		}
		if(c>0) {
			System.out.println("SQUARE");
		}
		else {
			System.out.println("NOT SQUARE");
		}
		while(a>0) {
			c++;
			if(c*c==num) {
			b=c*c;
			break;
			}
			a--;
		}
		//System.out.println(c);
		if(b==num) {
			System.out.println("SQUARE");
		}
		else if(b!=num) {
			System.out.println("NOT SQUARE");
		}
	}
}
