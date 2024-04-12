package oops2InheriPoly;
//Child Class-1 (Single Inheritance)
public class Car extends Vehicle {
	String brand;
	int price;
	public int findNetPrice(int price, int taxPercentage) {
		return price+(price*taxPercentage/100);
	}

}
