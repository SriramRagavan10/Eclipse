package for3;

public class ForAscending {
	public static void main(String[] args) {
		int[] nums= {34,1,62,48,16,5,20,4};
		int temp=0;       // If i give the above the for the value didn't change.
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
			System.out.println(nums[i]);
		}
	}

}
