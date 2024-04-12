package for2;

public class ForSquare {
	public static void main(String[]args) {
		int[] nums={9,8,9,7,4,2,1,3};
		for(int i=0; i<nums.length; i++) {
			int a=nums[i]*nums[i];
			if(a>20) {
				System.out.println(a);
			}
		}
	}

}
