package lms;

public class SubstringTask {
	public static void main(String[]args) {
		String x=args[0];
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		String a=x.substring(y,z);
		System.out.println(a);
		
	}

}
