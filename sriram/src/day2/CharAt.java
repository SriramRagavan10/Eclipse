package day2;

public class CharAt {
	public static void main(String[]args) {
		String name="Languages";
		char character1=name.charAt(2);
		char character2=name.charAt(name.length()-1);
		char character3=name.charAt(name.length()/2);
		System.out.println(character1+" "+character2+" "+character3);
	}

}
