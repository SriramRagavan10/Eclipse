package day2;

public class Test7 {
	public static void main(String[]args) {
		String lan="Java,PYTHON,CH+";
		String[] l1=lan.split(",");
		int len1=l1[0].length();
		int len2=l1[1].length();
		int len3=l1[2].length();
		String lo=l1[1].toLowerCase();
		System.out.println(l1[0]+"\n"+l1[1]+"\n"+l1[2]+"\n"+"\n"+len1+"\n"+len2+"\n"+len3+"\n"+"\n"+lo);
		
	}

}
