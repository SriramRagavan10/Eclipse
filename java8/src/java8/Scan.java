package java8;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.println("Enter Num 1 = ");
		System.out.println("Enter Num 2 = ");
		int a=data.nextInt();
		int b=data.nextInt();
		System.out.println(a+b);
	}

}
