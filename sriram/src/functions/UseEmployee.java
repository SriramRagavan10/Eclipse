package functions;

import for2.Employee;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Mohan";
		e1.age=26;
		e1.salary=20000;
		e1.experiance=2.3f;
		e1.isMale=true;
		Employee e2=new Employee();
		e2.name="Raji";
		e2.age=28;
		e2.salary=40000;
		e2.experiance=4.5f;
		e2.isMale=false;
		Employee e3=new Employee();
		e3.name="Rythan";
		e3.age=27;
		e3.salary=35000;
		e3.experiance=4.0f;
		e3.isMale=true;
		Employee e4=new Employee();
		e4.name="Magizhala";
		e4.age=24;
		e4.salary=25000;
		e4.experiance=2.2f;
		e4.isMale=false;
		Employee[] emp= {e1,e2,e3,e4};
		e1.findSalary(emp);
		e1.ageSalary(emp);
		e1.name(emp);
	}

}
