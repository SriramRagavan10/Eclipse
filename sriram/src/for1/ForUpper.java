package for1;

public class ForUpper {
	public static void main(String[]args) {          //if i put <= a.length()-1 if i put < a.length() 
		String a="ProGaRam";
		for(int i=0; i<=a.length()-1; i++) {
			if(a.charAt(i)>='A' && a.charAt(i)<='Z') {
				System.out.println(a.charAt(i));
			}
		}
	}

}
