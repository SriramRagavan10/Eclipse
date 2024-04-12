package oops2InheriPoly;

public class Department extends Office {
	private String hr;
	private String it;
	public Department(String name, String location, int totalNoOfEmp, String hr, String it) {
		super(name,location,totalNoOfEmp);
		this.hr=hr;
		this.it=it;
	}
	public String getHr() {
		return hr;
	}
	public void setHr(String hr) {
		this.hr = hr;
	}
	public String getIt() {
		return it;
	}
	public void setIt(String it) {
		this.it = it;
	}
	public String toString() {
		return super.toString()+", "+"HR: "+hr+", "+"IT: "+it;
	}
	

}
