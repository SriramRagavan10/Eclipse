package lms;

public class IntDemo2 {
	public static void main(String[]args) {
		String a=args[0];
		String[] b=a.split(",");
		int num1=Integer.parseInt(b[0]);
		int num2=Integer.parseInt(b[1]);
		System.out.println(num1+num2);
	}

}
