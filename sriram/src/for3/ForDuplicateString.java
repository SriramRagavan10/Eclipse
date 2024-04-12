package for3;

public class ForDuplicateString {

	public static void main(String[] args) {
		String a="this my name and this my house";
		String[] b=a.split(" ");
		for(int i=0; i<b.length; i++) {
			int count=0;
			for(int j=i+1; j<b.length; j++) {
				if(b[i].equals(b[j])) {
					count=count+1;
					b[j]="@";
				}
			}
			if(count>=0 && b[i]!="@") {
				System.out.println(b[i]);
			}
			if(count>0 && b[i]!="@") {
				System.out.println(count);
			}
		}

	}

}
