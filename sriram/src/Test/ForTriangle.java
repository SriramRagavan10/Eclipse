package Test;

public class ForTriangle {
	public static void main(String[] args) {
		for(int i =1; i<=4; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
