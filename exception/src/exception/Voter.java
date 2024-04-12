package exception;

public class Voter {
	public static void main(String[] args) throws Exception {
		//try {
		int a=17;
		//AgeException ae=new AgeException("Not Eligible");
		if(a>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeException("Not Eligible");
		}
		//}
//		finally {
//			System.out.println("Code Success");
//		}
	}
}
