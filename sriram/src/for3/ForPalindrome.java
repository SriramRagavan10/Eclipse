package for3;

public class ForPalindrome {
	public static void main(String[] args) {
		int a=414;
		int org=a;
		int b=0;
		while(a>0) {
			int r=a%10;
			b=(b*10)+r;
			a=a/10;
		}
		if(b==org) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
