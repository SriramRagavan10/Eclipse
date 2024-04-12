package Test;

import java.util.Arrays;
import java.util.List;

public class UseEmp {
	public static void main(String[] args) {
		List<Integer> sal=Arrays.asList(15000, 20000, 13500, 43000, 92000);
		List<Integer> exp=Arrays.asList(5, 6, 1, 4, 8);
		Emp maxSal=new Emp();
		Employee1 e1=maxSal::maxSalary;
		e1.details(sal);
		Employee1 e2=maxSal::minSalary;
		e2.details(sal);
		Employee1 e3=maxSal::maxExp;
		e3.details(exp);
		Employee1 e4=maxSal::minExp;
		e4.details(exp);
	}

}
