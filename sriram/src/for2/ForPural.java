package for2;

public class ForPural {
	public static void main(String[]args) {
		String[] a=new String[4];
		a[0]="Apples";
		a[1]="Orange";
		a[2]="Grapes";
		a[3]="Mango";
		for(int i=0; i<a.length; i++) {
			if(a[i].endsWith("s")) {
				System.out.println(a[i]);
			}
		}
	}

}
