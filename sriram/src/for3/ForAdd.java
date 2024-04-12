package for3;

public class ForAdd {
	public static void main(String[]args) {
		int a=4141;
		int temp=0;
		while(a>0) {
			int r=a%10;
			temp=temp+r;
			a=a/10;
		}
		System.out.println(temp);
		for(int i=0; i<a; i++) {
			int r=a%10;
			temp=temp+r;
			a=a/10;
		}
		System.out.println(temp);
	}

}
