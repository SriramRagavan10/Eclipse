package Test;

import java.util.Arrays;
import java.util.List;

public class UseEmployee {
	
	public static void main(String[] args) {
		Employee emp1= new Employee("Rythan", 16000, 325);
		Employee emp2= new Employee("Mozhiyaal", 25000, 285);
		Employee emp3= new Employee("Needhi", 28000, 345);
		Employee emp4= new Employee("Suban", 12000, 315);
		List<Employee> a=Arrays.asList(emp1, emp2, emp3, emp4);
		List<String> b=Arrays.asList(emp1.getName(), emp2.getName(), emp3.getName(), emp4.getName());
		System.out.println(emp1.listOfEmp(a));
		System.out.println(emp1.empName(b));
	}

}
