package for3;

public class ForPalindromeNumbers {
	public static void main(String[]args) {
		for(int i=100; i<=499; i++) {
			int num=i;
			int original=num;
			int sum=0;
			while(num>0) {
				int r=num%10;
				sum=sum*10+r;
				num=num/10;
			}
				if(original==sum) {
					System.out.println(i);
				}
		}
		
	}

}
