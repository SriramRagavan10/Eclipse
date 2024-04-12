package oops1;
//Composition
public class Employee {
	private String name;
	private String email;
	private int id;
	private int age;
	private AadharCard aadhar;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAadhar(AadharCard aadhar) {
		this.aadhar=aadhar;
	}
	public AadharCard getAadhar() {
		return aadhar;
	}

}
