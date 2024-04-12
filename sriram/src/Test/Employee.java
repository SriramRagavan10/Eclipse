package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	private String name;
	private int salary;
	private int id;
	public Employee (String name, int salary, int id) {
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Name: "+name+", ID: "+id+", Salary: "+salary;
	}
	public List<Employee> listOfEmp(List<Employee> e) {
		//List<Employee>b=e.stream().filter(x->x.getName().startsWith("S")).collect(Collectors.toList());
		return e;
	}
	public List<String> empName(List<String> b) {
		return b;
	}
}
