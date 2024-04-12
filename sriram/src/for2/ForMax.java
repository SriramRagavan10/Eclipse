package for2;

public class ForMax {
	public static void main(String[]args) {
		int[] arr= {9,12,6,20,7,30};
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
