package for1;

public class ForCheck {
	public static void main(String[]args) {
		String id="RaMsRi@078";
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(int i=0; i<id.length(); i++) {
			if(id.charAt(i)>='A' && id.charAt(i)<='Z') {
				a=a+1;
			}
			else if(id.charAt(i)>='a' && id.charAt(i)<='z') {
				b=b+1;
			}
			else if(id.charAt(i)>='0' && id.charAt(i)<='9') {
				c=c+1;
			}
			else {
				d=d+1;
			}
		}
		System.out.println(a+" - Uppercase");
		System.out.println(b+" - Lowercase");
		System.out.println(c+" - Number");
		System.out.println(d+" - Spl Character");
	}


}
