package oops2InheriPoly;
//Use Class-1 (Single Inheritance)
public class UseCar {
	public static void main(String[] args) {
		Car car=new Car();
		car.brand="BMW";
		car.colour="Blue";
		car.noOfWheels=4;
		car.price=2500000;
		car.weight=2.8f;
		System.out.println(car.brand+", "+car.colour+", "+car.noOfWheels+", "+car.price+", "+car.weight+", "+car.findMileage(66)+", "+car.findNetPrice(car.price,15));
	}

}
