package lms;

public class Student {
	public static void main(String[]args) {
		String a=args[0];
		char b=args[1].charAt(0);
		int c=Integer.parseInt(args[2]);
		String d=args[3];
		float e=Float.parseFloat(args[4]);
		long f=Long.parseLong(args[5]);
		boolean g=Boolean.parseBoolean(args[6]);
		System.out.println(a+" "+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g);
	}

}
