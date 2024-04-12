package java8;
import functions.Even;

public class UseMaxMin {
	public static void main(String[] args) {
		int[]nums= {13, 23, 16, 14, 12, 29};
		Cal c1=MaxMin::findMax;
		//c1.find(nums);
		MaxMin m=new MaxMin();
		Cal c2=m::findMin;
		//c2.find(nums);
		Even e=new Even();
		Cal c3=e::even;
		c3.find(nums);
	}
}
