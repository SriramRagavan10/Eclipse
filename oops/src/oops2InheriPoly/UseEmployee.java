package oops2InheriPoly;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp=new Employee("HCL","Chennai", 1000,"HR Admin", "Developer");
		System.out.println(emp+", "+emp.findOfficeType(emp.getTotalNoOfEmp()));
	}

}
