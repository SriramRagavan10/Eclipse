package collectionTask;

public class DupChar {
	public static void main(String[] args) {
		String a="onesoft";
		char[] b=a.toCharArray();
		for(int i=0; i<b.length; i++) {
			int c=0;
			for(int j=i+1; j<b.length; j++) {
				if(b[i]==b[j]) {
					c++;
					b[j]='$';
				}
			}
			if(c>0 && b[i]!='$') {
				System.out.println(b[i]);
			}
		}
	}
}
