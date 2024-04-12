package Test;
public class CancelDuplicate {
	public static void main(String[]args) {
		String a="onesoft";
		char[] c=a.toCharArray();
		for(int i=0; i<c.length; i++) {
			int count=1;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j]) {
					c[j]='$';
					count=count+1;
				}
			}
			if(count>=1 && c[i]!='$') {
				System.out.println(c[i]+" "+count);
			}
		}
	}

}
