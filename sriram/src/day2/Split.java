package day2;

public class Split {
	public static void main(String[]args) {
		String a="Language";
		String[] b=a.split("u");
		String a1="Java,Python,C++";
		String[] b1=a1.split(",");
		int l1=b1[0].length();
		System.out.println(l1+","+b1[2]+"\n"+b[1]);
		
	}

}
