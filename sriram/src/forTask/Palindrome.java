package forTask;

public class Palindrome {
	public static void main(String[] args) {
		String name="madam";
		String pal="";
		for(int i=name.length()-1; i>=0; i--) {
			pal=pal+name.charAt(i);
			if(pal.equals(name)) {
				System.out.println("Palindrome");
				return;
			}
		}
			System.out.println("Not a Palindrome");
		
	}

}
