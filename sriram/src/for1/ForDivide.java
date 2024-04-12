package for1;

public class ForDivide {
	public static void main(String[]args) {
		int a=0;
		for(int i=1; i<=20; i++) {
			if(i%3==0 && i%2==0) {
				//System.out.println(i);
				a=a+1;
			}
		}
		System.out.println(a);
	}

}
