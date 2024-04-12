package Test;

public class FirstCap {
	public static void main(String[] args) {
		String a="i sing a song";
		String[] b=a.split(" ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i].substring(0,1).toUpperCase()+b[i].substring(1,b[i].length())+" ");
		}
	}
}