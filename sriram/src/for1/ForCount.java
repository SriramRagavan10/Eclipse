package for1;

public class ForCount {
	public static void main(String[]args) {
		int n1=-8;
		int n2=5;
		int c1=0;
		int c2=0;
		for(int i=n1; i<=n2; i++) {
			if(i>0) {
				c1=c1+1;
			}
			else if(i<0) {
				c2=c2+1;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	}

}
