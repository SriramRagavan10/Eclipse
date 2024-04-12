package for1;

public class ForStringVowels {
	public static void main(String[]args) {
		String a="Language";
		int a1=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
				a1=a1+1;
			}
		}
		System.out.println(a1);
	}

}
