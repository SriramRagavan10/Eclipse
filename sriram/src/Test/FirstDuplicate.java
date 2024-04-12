package Test;

public class FirstDuplicate {
	public static void main(String[] args) {
		String a="Kannan";
		char[] c=a.toCharArray();
		char c1=' ';
		for(int i=c.length-1; i>=0; i--) {
			int count=0;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j]) {
					c[j]='$';
					count=count+1;
				}
			}
				if(count>0 && c[i]!='$') {
					c1=c[i];
				}
			}
		System.out.println(c1);
	
	}

}
