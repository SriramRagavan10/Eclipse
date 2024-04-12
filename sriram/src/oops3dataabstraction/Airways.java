package oops3dataabstraction;

public abstract class Airways {
	public abstract String findType(int seatNumber);
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

}
