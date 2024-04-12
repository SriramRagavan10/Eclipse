package functions;

public class Things {
	public String findCount(String[] a) {
		int c=0;
		for(int i=0; i<a.length; i++) {
			if(a[i].startsWith("S")) {
				c=c+1;
			}
		}
		return "Count: "+(c);
	}

}
