package conditions;

public class Vowel {
	public static void main(String[]args) {
		String a="Live";
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			System.out.println(a+" is a Vowels");
		}
		else {
			System.out.println(a+" is not a Vowels");
		}
	}

}
