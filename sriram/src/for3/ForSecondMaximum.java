package for3;

public class ForSecondMaximum {
	public static void main(String[]args) {
		int[] nums={55, 48, 75, 99, 64, 85,};
		int max=nums[0];
		int secmax=max;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				secmax = max;
				max=nums[i];
			}
			else if(nums[i]> secmax && nums[i]!=max) {
				secmax=nums[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
 	}

}
