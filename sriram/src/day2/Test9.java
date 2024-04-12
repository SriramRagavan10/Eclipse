package day2;

public class Test9 {
	public static void main(String[]args) {
		String name="Fantasy program";
		boolean a1=name.startsWith("F");
		boolean a2=name.endsWith("s");
		int l=name.length();
		char c=name.charAt(name.length()-2);
		System.out.println(a1+" "+a2+"\n"+l+"\n"+c);
	}

}
