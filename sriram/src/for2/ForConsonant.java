package for2;

public class ForConsonant {
	public static void main(String[]args) {
		String[] a=new String[4];
		a[0]="Feel";
		a[1]="Value";
		a[2]="Try";
		a[3]="Fly";
		for(int i=0; i<a.length; i++) {
			if(a[i].contains("a") || a[i].contains("e") || a[i].contains("i") || a[i].contains("o") || a[i].contains("u") || a[i].contains("A") || a[i].contains("E") || a[i].contains("I") || a[i].contains("O") || a[i].contains("U")) {
				continue;
			}
			System.out.println(a[i]);
		}
	}

}
