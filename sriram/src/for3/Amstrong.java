package for3;

public class Amstrong {
	public static void main(String[]args) {
		int num=153;
		int original=num;
		int temp=0;
		int result=0;
		for(;num>0;) {
			int reminder=num%10;
			temp=reminder*reminder*reminder;
			result=result+temp;
			num=num / 10;
		}
		if(result==original) {
			System.out.println(result+" is Amstrong");
		}
		else {
			System.out.println(result+" is Not an Amstrong");
		}
	}

}
