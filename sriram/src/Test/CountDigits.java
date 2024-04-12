package Test;

public class CountDigits {
	public static void main(String[] args) {
		int value=1432235;
		int count=0;
//		for(int i=value; i>=0; i--) {
//			int r=i%10;
//			count++;
//			i=i/10;
//		}
		while(value > 0 ) {
			count++;
			value=value/10;
		}
		System.out.println(count);
	}

}
