package oops2InheriPoly;

public class Employee extends Department {
	public Employee(String name, String location, int totalNoOfEmp, String hr, String it) {
		super(name, location, totalNoOfEmp, hr, it);
	}
	public String toString() {
		return super.toString();
	}

}
