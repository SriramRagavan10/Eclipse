package for3;

public class ForTarget {
	public static void main(String[]args) {
		int[] nums= {1,6,3,9,2,5,4};
		int target=7;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println(nums[i]+" "+nums[j]);
				}
			}
		}
	}
}