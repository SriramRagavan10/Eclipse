package lms;

public class Student1 {
	public static void main(String[]args) {
		String[] name=args[0].split(",");
		String a=name[0];
		char b=name[1].charAt(0);
		int c=Integer.parseInt(name[2]);
		String d=name[3];
		float e=Float.parseFloat(name[4]);
		long f=Long.parseLong(name[5]);
		boolean g=Boolean.parseBoolean(name[6]);
		System.out.println(a+" "+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g);
		
	}

}
