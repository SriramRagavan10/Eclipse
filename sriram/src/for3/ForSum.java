package for3;

public class ForSum {
	public static void main(String[]args) {
		int num=2356;
		int temp=0;
		for(int i=num; i>0; i--) {
			int reminder=num%10;
			temp=temp+reminder;
			num=num / 10;
		}
			System.out.println(temp); 
	}

}
