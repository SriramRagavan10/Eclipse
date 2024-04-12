package java8;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c1=(x,y)->(x+y);
		System.out.println(c1.find(16, 13));
		Calculator c2=(x,y)->{
			if(x>y) {
				return x;
			}
			else {
				return y;
			}
		};
		System.out.println(c2.find(340, 470));
	}
}
