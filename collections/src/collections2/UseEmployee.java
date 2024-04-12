package collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Rythan", 365, 30000, "Male", 3);
		Employee e2=new Employee("Suban", 366, 35000, "Male", 2);
		Employee e3=new Employee("Magizhaal", 367, 37000, "Female", 4);
		Employee e4=new Employee("Mozhiyaal", 368, 20000, "Female", 1);
		Employee e5=new Employee("Arunmozhi", 369, 40000, "Male", 6);
		Employee e6=new Employee("Ramana", 370, 80000, "Male", 9);
		Map<Integer,Employee>emp=new HashMap<>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		emp.put(5, e5);
		emp.put(6, e6);
	    System.out.println(emp.keySet().size());
		for(Employee e:emp.values()) {
			System.out.println(e);
		}
		System.out.println();
		//emp.keySet().stream().forEach(x->System.out.println(x));
		for(Integer x: emp.keySet()) {
			System.out.println(x);
		}
		System.out.println("\n");
		emp.forEach((m, n) -> System.out.println(m+", "+n));
		System.out.println("\n");
		for(Integer x: emp.keySet()) {
			System.out.println(emp.get(x));
		}
		//emplo
		Map<Integer, Employee>emp1=new HashMap<>();
		for(Employee val:emp.values()) {
			if(val.getName().startsWith("S")) {
				emp1.put(val.getId(), val);
			}
		}
		System.out.println("\n"+"\n");
		emp1.forEach((u,v)->System.out.println(v));
		
		//Employee Salary Increment
		Map<Integer, Employee>emp2=new HashMap<>();
		int o=0;
		for(Employee c:emp.values()) {
			if(c.getExperiance()>2) {
				c.setSalary(c.getSalary()+(c.getSalary()*15/100));
				o=o+1;
				emp2.put(o, c);
			}
		}
		System.out.println("\n"+"\n");
		emp2.forEach((u,v)->System.out.println(u+")"+v));
		
		System.out.println("\n"+"\n");
		Map<Integer, Employee>emp3=new HashMap<>();
		for(Integer x : emp.keySet()) {
			if(emp.get(x).getSalary()>45000) {
				emp3.put(emp.get(x).getId(), emp.get(x));
			}
			else if(emp.get(x).getName().startsWith("M")) {
				emp3.put(emp.get(x).getId(), emp.get(x));
			}
		}
		emp3.forEach((u,v)->System.out.println(u+")"+v));
		
		System.out.println("-----------");
		
		Iterator<Employee> var=emp.values().iterator();
		while(var.hasNext()) {
			if(var.next().getName().equals("Mozhiyaal")) {
			var.remove();
			}
		}
		System.out.println(emp);
//		for(Employee e:emp.values()) {
//			System.out.println(e);
//		}
	}

}
