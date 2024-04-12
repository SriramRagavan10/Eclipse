package conditions;

public class CharAtMethod {
	public static void main(String[]args) {
		String a="TesT";
		char c1=a.charAt(0);
		char c2=a.charAt(a.length()-1);
		if(c1==c2) {
			System.out.println(a+" is Equal");
		}
		else {
			System.out.println(a+" is Not Equal");
		}
	}

}
