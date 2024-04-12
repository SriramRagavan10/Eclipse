package forTask;

import java.util.Arrays;

public class TwoArrayAscending {
	public static void main(String[] args) {
		int[] num1= {1,2,3,4};
		int[] num2= {6,2,3,5};
		int[] res= new int[num1.length+num2.length];
		for(int i=0; i<num1.length; i++) {
			res[i]=num1[i];
		}
		for(int i=0; i<num2.length; i++) {
			res[i+num1.length]=num2[i];
		}
		Arrays.sort(res);
		System.out.print("{");
		for(int i=0; i<res.length; i++) {
			int count=0;
			for(int j=i+1; j<res.length; j++) {
				if(res[i]==res[j]) {
					count++;
					res[j]='#';
				}
			}
			if(count==0 && res[i]!='#') {
				res[i]=res[i];
				System.out.print(res[i]);
			}
			if(i<res.length-1 && count==0 && res[i]!='#') {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}
