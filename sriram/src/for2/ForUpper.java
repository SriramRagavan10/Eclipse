package for2;

public class ForUpper {
	public static void main(String[]args) {
		String[] a=new String[4];
		a[0]="APPLE";
		a[1]="ORaNgE";
		a[2]="KIWI";
		a[3]="Mango";
		for(int i=0; i<a.length; i++) {
			if(a[i].equals(a[i].toUpperCase())) {
				System.out.println(a[i]);
			}
		}
	}

}
