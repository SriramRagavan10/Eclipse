package for2;

public class Employee {
	
	public String name;
	public int age;
	public int salary;
	public float experiance;
	public boolean isMale;
	
	//functions method
	public void findSalary(Employee[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i].salary>=25000 && a[i].salary<=45000) {
				System.out.println(a[i].name);
		}
		}
	}
	public void ageSalary(Employee[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i].age>=25) {
				System.out.println(a[i].salary);
			}
		}
	}
	public void name(Employee[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].name.toUpperCase());
			}
		}

}
