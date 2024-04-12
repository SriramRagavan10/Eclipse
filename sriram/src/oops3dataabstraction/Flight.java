package oops3dataabstraction;

public class Flight extends Airways {
	public String findType(int seatNumber) {
		if(seatNumber>=1 && seatNumber<=25) {
			return "Business Class";
		}
		else {
			return "Economic Class";
		}
	}

}
