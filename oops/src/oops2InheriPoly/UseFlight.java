package oops2InheriPoly;
//Use Class (Single Inheritance with Encapsulation)
public class UseFlight {
	public static void main(String[]args) {
		Flight flight=new Flight("Blue", 50, 6, "Air Deccan", 30000);
		System.out.println(flight+"\n"+flight.findType(19)+"\n"+ flight.findClass(flight.getPrice()));
	}

}
