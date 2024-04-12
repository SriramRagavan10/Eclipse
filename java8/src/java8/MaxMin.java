package java8;

public class MaxMin {
	public static void findMax(int[] a) {
		int max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	public void findMin(int[] a) {
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
