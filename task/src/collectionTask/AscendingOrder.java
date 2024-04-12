package collectionTask;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {6,2,5,3};
		int[] res=new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			res[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			res[i+a.length]=b[i];
		}
		Arrays.sort(res);
		System.out.print("{");
		for(int i=0; i<res.length; i++) {
			int c=0;
			for(int j=i+1; j<res.length; j++) {
				if(res[i]==res[j]) {
					res[j]='@';
					c++;
				}
			}
			if(c==0 && res[i]!='@') {
				System.out.print(res[i]);
		}
			if(i>=res.length/2-1 && res[i]<res[res.length-1]) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
