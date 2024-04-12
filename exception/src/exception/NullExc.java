package exception;

public class NullExc {
	public static void main(String[] args) {
		String a=null;
		System.out.println(a);
		try {
		char c=a.charAt(0);
		System.out.println(c);
		}
		catch(NullPointerException n) {
			System.out.println(n);
			n.printStackTrace();
		}
	}

}
