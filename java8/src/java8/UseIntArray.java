package java8;

public class UseIntArray {
	public static void main(String[] args) {
		int [] a= {23,55,77,83};
		IntArray a1=(x)->{
			for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+",");
			}
		};
		a1.arr(a);
		System.out.println();
		IntArray a2=x->{
			int min=x[0];
			for(int i=0; i<x.length; i++) {
				if(x[i]<min) {
					min=x[i];
				}
			}
			System.out.println(min);
		};
		a2.arr(a);
	}

}
