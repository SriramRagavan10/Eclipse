package collectionTask;

import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		int arr[][]= {{2,3,4},{6,5,3},{1,2,3}};
		int[][] a=new int[arr.length][arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				//a[i][i]=arr[i][j]*arr[j][i]+a[i][i];
				for(int k=0; k<arr.length;k++) {
					a[i][j]=arr[j][k]*arr[k][j]+a[i][j];
				}
			}
		}
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
	}
}
