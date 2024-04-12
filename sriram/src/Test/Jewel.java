package Test;

public class Jewel {
	public static void main(String[] args) {
		String a="b";
		String b="aAAbbbb";
		int c=0;
		int c1=0;
		for(int i=0; i<b.length(); i++) {
			for(int j=0; j<a.length(); j++) {
				if(b.charAt(i)==a.charAt(j)) {
					c++;
				}
			}
		}
		for (int i = 0; i < b.length(); i++) {
            if (a.indexOf(b.charAt(i)) != -1) {
                c1++;
            }
        }
		System.out.println(c1);
	}

}
