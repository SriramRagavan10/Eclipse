package for1;

public class ForElseIf {
	public static void main(String[]args) {
		String id="RaMsRi@078";
		for(int i=0; i<id.length(); i++) {
			if(id.charAt(i)>='A' && id.charAt(i)<='Z') {
				System.out.println(id.charAt(i)+" - Uppercase");
			}
			else if(id.charAt(i)>='a' && id.charAt(i)<='z') {
				System.out.println(id.charAt(i)+" - Lowercase");
			}
			else if(id.charAt(i)>='0' && id.charAt(i)<='9') {
				System.out.println(id.charAt(i)+" - Number");
			}
			else {
				System.out.println(id.charAt(i)+" - Spl Character");
			}
		}
	}

}
