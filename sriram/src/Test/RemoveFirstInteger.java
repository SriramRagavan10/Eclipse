package Test;

public class RemoveFirstInteger {
	public static void main(String[] args) {
		String a="Hello2435World";
		String b="";
		char[] c=a.toCharArray();
		boolean remove=true;
		for(int i=0; i<c.length; i++) {
			if(c[i]>='0' && c[i]<='9' && remove!=false) {
				remove=false;
			}
			else {
				//b=b+c[i];
				b=c[i]+b;
			}
		}
		System.out.println(b);
//		for(int i=b.length()-1; i>=0; i--) {
//			System.out.print(b.charAt(i));
//		}
	}

}
