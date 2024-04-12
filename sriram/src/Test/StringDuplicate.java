package Test;

public class StringDuplicate {
	public static void main(String[] args) {
		String a="I am Prabhu and I am from Canada";
		String[] b=a.split(" ");
		for(int i=0; i<b.length; i++) {
			int count=0;
			for(int j=i+1; j<b.length; j++) {
				if(b[i].equals(b[j])) {
					b[j]="@";
					count=count+1;
				}
			}
			if(count>=0 && b[i]!="@") {
				System.out.print(b[i]+" ");
			}
		}
	}

}
