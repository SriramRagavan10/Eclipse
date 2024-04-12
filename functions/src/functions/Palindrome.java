package functions;

public class Palindrome {
	public String findPalindrome(int a) {
		int t=a;
		int s=0;
		while(a>0) {
			int r=a%10;
			s=(s*10)+r;
			a=a/10;
		}
		if(s==t) {
			return "Palindrome";
		}
		else {
			return "Not a Palindrome";
		}
	}

}
