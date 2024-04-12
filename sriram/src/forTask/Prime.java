package forTask;

public class Prime {
	public static void main(String[] args) {
		int a=2;
		boolean b=true;
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				b=false;
			}
		}
		if(b==true) {
			System.out.println(a+" is Prime");
		}
		else {
			System.out.println(a+" is Not Prime");
		}
	}

}
