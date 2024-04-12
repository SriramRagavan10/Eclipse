package for2;

public class UseEmployeeSecond {
	public static void main(String[]args) {
		EmployeeSecond e1=new EmployeeSecond();
		e1.name="Raja";
		e1.age=26;
		e1.salary=20000;
		e1.experiance=2.3f;
		e1.isMale=true;
		EmployeeSecond e2=new EmployeeSecond();
		e2.name="Kalairani";
		e2.age=28;
		e2.salary=40000;
		e2.experiance=4.5f;
		e2.isMale=false;
		EmployeeSecond e3=new EmployeeSecond();
		e3.name="Abimanyu";
		e3.age=27;
		e3.salary=35000;
		e3.experiance=4.0f;
		e3.isMale=true;
		EmployeeSecond e4=new EmployeeSecond();
		e4.name="Deva";
		e4.age=25;
		e4.salary=25000;
		e4.experiance=2.2f;
		e4.isMale=false;
		EmployeeSecond[] a= {e1,e2,e3,e4};
		for(EmployeeSecond emp:a) {
			System.out.println(emp.name+" "+emp.age+" "+emp.salary+" "+emp.experiance+" "+emp.isMale);
		}
	}

}
