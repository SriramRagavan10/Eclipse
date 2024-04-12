package Test;

public class Mail {
	public static void main(String[] args) {
		String username="ramsri078";
		String password="12345678";
		boolean b=true;
		for(int i=0; i<username.length(); i++) {
//			if(username.charAt(i)>='a' && username.charAt(i)<='z' || username.charAt(i)>='0' && username.charAt(i)<='9') {
//				b=true;
//			}
			if (username.charAt(i)>='A' && username.charAt(i)<='Z') {
				b=false;
			}
		}
		if(b==true) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		if(password.length()==5) {
			System.out.println("Weak");
		}
		else if(password.length()>5 && password.length()<=7) {
			System.out.println("Good");
		}
		else if(password.length()>7) {
			System.out.println("Strong");
		}
		
	}

}
