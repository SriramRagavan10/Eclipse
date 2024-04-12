package for1;

public class ForCheckLower {
	public static void main(String[]args) {
		String a="PalINDRome";
		int a1=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				a1=a1+1;
			}
		}
		System.out.println(a1);
	}

}
