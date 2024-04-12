package Test;
import java.util.Scanner;
//Its not a teaching program
public class LoopsScanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Armstrong Numbers ");
		System.out.println("Palindrome");
		
		int n=s.nextInt();
		for(int i=100; i<n; i++) {
			int num=i;
			int org=num;
			int temp=0;
			int res=0;
			for(; num>0;) {
				int rem=num%10;
				temp=rem*rem*rem;
				res=res+temp;
				num=num/10;
			}
			if(res==org) {
				System.out.println(res);
			}
		}
		String m=s.next();
		String b="";
		for(int i=m.length()-1; i>=0; i--) {
			b=b+m.charAt(i);
		}
//		if(m.equals(b)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not a Palindrome");
//		}
	}

}
