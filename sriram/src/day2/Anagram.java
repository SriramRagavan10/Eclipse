package day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[]args) {
		String a="Abcd".toUpperCase();
		String b="dbba".toUpperCase();
		//if(a.contains(b)) {
			//System.out.println("ANAGRAM");
		//}
		//else {
			//System.out.println("NOT ANAGRAM");
		//}
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2)) {
			System.out.println("ANAGRAM");
		}
		else {
			System.out.println("NOT ANAGRAM");
		}
	}

}
