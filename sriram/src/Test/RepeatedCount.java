package Test;

public class RepeatedCount {
	public static void main(String[]args) {
		String a="bottle";
		char[] c=a.toCharArray();
		int c1=0;
		int c2=0;
		for(int i=0; i<c.length; i++) {
			int count=0;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j]) {
					c[j]='$';
					count=count+1;
				}
			}
			if(count==0 && c[i]!='$') {
				c1++;
			}
			if(count>0 && c[i]!='$') {
				c2++;
			}
		}
		System.out.println("Repeated Count: "+c2+"\n"+"Non Repeated Count: "+c1);
		
	}

}
