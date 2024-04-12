package collectionTask;

public class DuplicateCharCount {
	public static void main(String[] args) {
		String a="onesoft";
		for(int i=0; i<a.length(); i++) {
			int c=1;
			for(int j=i+1; j<a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)) {
					c++;
				}
			}
			if(c>1) {
				System.out.println(a.charAt(i)+"-"+c);
			}
		}
	}

}
