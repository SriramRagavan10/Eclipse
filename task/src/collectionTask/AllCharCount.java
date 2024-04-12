package collectionTask;

public class AllCharCount {
	public static void main(String[] args) {
		String a="onesoft";
		char[] b=a.toCharArray();
		for(int i=0; i<b.length; i++) {
			int c=1;
			for(int j=i+1; j<b.length; j++) {
				if(b[i]==b[j]) {
					c++;
					b[j]='@';
				}
			}
			if(c>=1 && b[i]!='@') {
				System.out.println(b[i]+"-"+c);
			}
		}
	}

}
