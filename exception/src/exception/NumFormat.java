package exception;

public class NumFormat {
	public static void main(String[] args) {
		String a="Rythan1999";
		try {
		int b=Integer.parseInt(a);
		System.out.println(b);
		}
		catch(NumberFormatException num) {
			//System.out.println(num);
			num.printStackTrace();
		}
	}

}
