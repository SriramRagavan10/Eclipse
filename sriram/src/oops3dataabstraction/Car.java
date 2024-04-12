package oops3dataabstraction;

public class Car implements Vehicle {
	public int findMileage(int speed) {
		if(speed>=0 && speed<=40) {
			return 60;
		}
		else if(speed>40 && speed<=80) {
			return 40;
		}
		else {
			return 20;
		}
	}
	public int findNetPrice(int price, int tax) {
		return (price+tax);
	}

}
