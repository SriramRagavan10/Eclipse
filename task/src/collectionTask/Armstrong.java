package collectionTask;

public class Armstrong {
	public static void main(String[] args) {
		//for(int i=100; i<1000; i++) {
			int n=370;
			int org=n;
			int temp=0;
			while(n>0) {
				int rem=n%10;
				temp=temp+(rem*rem*rem);
				n=n/10;
			}
			if(org==temp) {
				System.out.println(org+" is Armstrong");
			}
	//		else {
	//			System.out.println(org+" is Not Armstrong");
	//		}
		//}
	}

}
