package oops3dataabstraction;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		System.out.println(car1.findMileage(45));
		System.out.println(car1.findNetPrice(200000,5000));
	}

}
