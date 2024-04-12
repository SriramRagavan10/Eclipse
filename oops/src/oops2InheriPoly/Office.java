package oops2InheriPoly;

public class Office {
	private String name;
	private String location;
	private int totalNoOfEmp;
	public String findOfficeType(int totalNoOfEmp) {
		if(totalNoOfEmp>=1000) {
			return "Tier 1";
		}
		else {
			return "Tier 2";
		}
	}
	public Office(String name, String location, int totalNoOfEmp) {
		this.name=name;
		this.location=location;
		this.totalNoOfEmp=totalNoOfEmp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTotalNoOfEmp() {
		return totalNoOfEmp;
	}
	public void setTotalNoOfEmp(int totalNoOfEmp) {
		this.totalNoOfEmp = totalNoOfEmp;
	}
	public String toString() {
		return "Office Name: "+name+", "+"Office Location: "+location+", "+"Total No Of Employee: "+totalNoOfEmp;
	}
	

}
