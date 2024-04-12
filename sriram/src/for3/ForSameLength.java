package for3;

public class ForSameLength {
	public static void main(String[]args) {
		String a="Test with good Prototype";
		String[] b=a.split(" ");
		for(int i=0; i<b.length; i++) {
			for(int j=i+1; j<b.length; j++) {
				if(b[i].length()==b[j].length()) {
					System.out.println(b[i]+" "+b[j]);
					
				}
			}
		}
	}

}
