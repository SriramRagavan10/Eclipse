package collectionTask;

import java.util.Arrays;

public class SortStringInt {
	public static void main(String[] args) {
		String[]stringArray = {"a","b","c","d","e","f","g","h"};
		int[]intArray = {0, 1, 1, 0, 1, 2, 2, 0};
		int	tempInt=0;
		String tempString="";
		for(int	i=0;i<intArray.length;i++) {
			for(int j=i+1;j<intArray.length;j++) { 
				if(intArray[i]>intArray[j]) { 
					tempInt=intArray[i];
			
					tempString=stringArray[i];

					intArray[i]=intArray[j];

					stringArray[i]=stringArray[j];

					intArray[j]=tempInt;

					stringArray[j]=tempString;
					}
				}
			}
		System.out.println(Arrays.toString(stringArray));
	}
}
