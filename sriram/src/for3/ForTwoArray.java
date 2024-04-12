package for3;

import java.util.Arrays;

public class ForTwoArray {
	public static void main(String[] args) {
		int[] a= {1, 2, 7, 4};
		int[] b= {3, 2, 5, 7};
		int[] result=new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			int count=0;
				for(int j=0; j<b.length; j++) {
					if(a[i]==b[j]) {
						count=count+1;
					}
			}
			if(count==0) {
				result[i]=a[i];
			}
		}	
		for(int i=0; i<b.length; i++) {
			int count=0;
				for(int j=0; j<a.length; j++) {
					if(b[i]==a[j]) {
						count=count+1;
					}
			}
			if(count==0) {
				result[(result.length-1)-i]=b[i];
			}
		}
			Arrays.sort(result);
			//System.out.println(Arrays.toString(result));
			for(int i=0;i<result.length;i++) {
				if(result[i]==0) {
					continue;
				}
				System.out.println(result[i]);
			}
	}

}
