package Test;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		String[] a= {"Scale", "Pencile", "Rubber", "Sharpnar", "Pen", };
		String[] b=new String[a.length];
		for(int i=0; i<a.length; i++) {
			b[(b.length-1)-i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		String d="";
		for(int i=0; i<b.length; i++) {
			String c="";
			for(int j=b[i].length()-1; j>=0; j--) {
			c=c+b[i].charAt(j);
		}
		System.out.println(c);
		System.out.println(c+c);
	}
	
	}

}
