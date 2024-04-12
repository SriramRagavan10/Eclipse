package oops2InheriPoly;
//Child Class (Single Inheritance with Encapsulation)
public class Flight extends AirWays {
	private String brand;
	private int price;
	public String findClass(int price) {
		if(price>=25000) {
			return "Business Class Passenger";
		}
		else if(price<25000) {
			return "Economic Class Passenger";
		}
		else {
			return "No Seats";
		}
	}
	public Flight(String color, int noOfSeats, int noOfWheels, String brand, int price) {
		super(color,noOfSeats,noOfWheels);
		this.brand=brand;
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Brand: "+brand+", "+"Price: "+price+", "+super.toString();
	}
	

}
