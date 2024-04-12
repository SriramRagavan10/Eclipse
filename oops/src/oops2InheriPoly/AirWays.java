package oops2InheriPoly;
//Parent Class (Single Inheritance with Encapsulation)
public class AirWays {
	private String color;
	private int noOfSeats;
	private int noOfWheels;
	public String findType(int seatNumber) {
		if(seatNumber>=1 && seatNumber<=25) {
			return "Business Class";
		}
		else {
			return "Economical Class";
		}
	}
	public AirWays(String color, int noOfSeats, int noOfWheels) {
		this.color=color;
		this.noOfSeats=noOfSeats;
		this.noOfWheels=noOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String toString() {
		return "Color: "+color+", "+"No Of Seats: "+noOfSeats+", "+"No Of Wheels: " +noOfWheels;
	}
}