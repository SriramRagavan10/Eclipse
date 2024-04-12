package Test;

public class Diagonals {
	public static void main(String[] args) {
		int arr[][]= {{2,3,4},{6,4,3},{1,2,3}};
		//System.out.println(arr[0].length);
		int a=1;
		for(int i=0; i<arr.length;i++) {
			a=a*arr[i][i];
			//a=a*arr[i][arr.length-i-1];
		}
//		if(arr.length%2==1) {
//			a=a/arr[arr.length/2][arr.length/2];
//		}
		System.out.println(a);
		String decimalSeparator = "\\.";
		System.out.println(2.66f+decimalSeparator);
	}

}
