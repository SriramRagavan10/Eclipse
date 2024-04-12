package for2;

public class ForLength {
	public static void main(String[]args) {
		String[] a=new String[4];
		a[0]="Ragavan";
		a[1]="Sriram";
		a[2]="Sai";
		a[3]="Baba";
		for(int i=0; i<a.length; i++) {
			if(a[i].length()>=5) {
				System.out.println(a[i]);
			}
		}
	}

}
