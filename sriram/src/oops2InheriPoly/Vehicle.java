package oops2InheriPoly;
//Parent Class-1 (Single Inheritance)
public class Vehicle {
	String colour;
	float weight;
	int noOfWheels;
	public int findMileage(int speed) {
		if(speed>0 && speed<=40) {
			return 60;
		}
		else if(speed>40 && speed<=80) {
			return 40;
		}
		else {
			return 20;
		}
	}

}
