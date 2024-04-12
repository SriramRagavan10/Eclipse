package exception;

public class IndexBound {
	public static void main(String[] args) {
		String a="Mozhiyaal";
		System.out.println(a);
		try {
		char c=a.charAt(9);
		System.out.println(c);
		}
		catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
			System.out.println(i);
		}
	}

}
