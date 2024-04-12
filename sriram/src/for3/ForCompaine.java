package for3;

public class ForCompaine {
	public static void main(String[]args) {
		String a="Java";
		String b="Language";
		String a1=a.substring(0,a.length()/2);
		String a2=a.substring(a.length()/2,a.length());
		String b1=b.substring(0,b.length()/2);
		String b2=b.substring(b.length()/2,b.length());
		String c=a1+b1+a2+b2;
		System.out.println(c);
	}

}
