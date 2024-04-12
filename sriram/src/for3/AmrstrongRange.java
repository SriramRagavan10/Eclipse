package for3;

public class AmrstrongRange {
	public static void main(String[] args) {
		for(int i=100; i<1000; i++) {
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
	}

}
