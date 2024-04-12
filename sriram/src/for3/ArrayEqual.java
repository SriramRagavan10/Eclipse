package for3;

import java.util.Arrays; //ctrl+shift+o for import

public class ArrayEqual {
	public static void main(String[]args) {
		int[] a = {24, 89, 78, 45};
		int[] b = {24, 6, 78, 45};
		
		if(Arrays.equals(a, b)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
