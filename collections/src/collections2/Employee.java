package collections2;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String gender;
	private int experiance;
	public Employee(String name, int id, int salary, String gender, int experiance) {
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.gender=gender;
		this.experiance=experiance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String toString() {
		return "Name: "+name+" ,Salary: "+salary+" ,ID: "+id+" ,Gender: "+gender+" ,Experiance: " +experiance;
	}

}
