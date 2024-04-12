package Test;

public class ForDupCount {
	public static void main(String[]args) {
		String a="RAMKUMAR";
		char[] c=a.toCharArray();
		for(int i=0; i<c.length; i++) {
			int count=0;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j]) {
					count=count+1;
				}
			}
			if(count>0) {
				System.out.println(c[i]+" "+count);
			}
		}
	}

}
