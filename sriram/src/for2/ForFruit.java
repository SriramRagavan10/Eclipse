package for2;

public class ForFruit {
	public static void main(String[]args) {
		String[] word=new String[4];
		word[0]="Apple";
		word[1]="Orange";
		word[2]="Grapes";
		word[3]="Mango";
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i].charAt(i));
		}
	}

}
