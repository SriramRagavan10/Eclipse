package for3;

import java.util.Arrays;

public class TwoArrayAscending {
	public static void main(String[] args) {
		int[] a= { 1, 2, 7, 4};
		int[] b= { 3, 2, 5, 7};
		int[] result=new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			result[i]=a[i];
		}	
		for(int i=result.length-1; i>=b.length; i--) {
			result[i]=b[(result.length-1)-i];
		}
		//System.out.println(Arrays.toString(result));
		int t=0;
		for(int i=0; i<result.length; i++) {
			int c=1;
			for(int j=i+1; j<result.length; j++) {
				if(result[i]==result[j]) {
					c=c+1;;
					result[j]='@';
				}
				if(result[i]>result[j]) {
					t=result[i];
					result[i]=result[j];
					result[j]=t;
				}
			}
			if(c<=1 && result[i]!='@') {
				System.out.println(result[i]);
			}
		}
	}


}
