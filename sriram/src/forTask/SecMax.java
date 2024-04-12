package forTask;

public class SecMax {
	public static void main(String[] args) {
		int[] nums= {1000, 646, 16, 835, 999};
		int max=nums[0];
		int sec=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				sec=max;
				max=nums[i];
			}
			if(nums[i]>sec && nums[i]!=max) {
				sec=nums[i];
			}
		}
		//System.out.println(max);
		System.out.println(sec);
	}

}
