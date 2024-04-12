package for1;

public class ForCheckPrime {
	public static void main(String[]args) {
		int num=5;
		String a="Prime";
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				a="Not a Prime";
			}
		}
		if(a=="Prime") {
			System.out.println(a);
		}
		else {
			System.out.println(a);
		}
	}

}
