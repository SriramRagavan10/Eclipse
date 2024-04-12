package for2;

public class UseEmployee {
	public static void main(String[]args) {
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
		Employee[] a= {e1,e2,e3,e4};
		//Details
		for(int i=0; i<a.length; i++) {
		//System.out.println("NAME: "+a[i].name.toUpperCase()+" "+"AGE: "+a[i].age+" "+"SALARY: "+a[i].salary+" "+"EXPERIENCE: "+a[i].experiance+" "+"ISMALE: "+a[i].isMale+"\n");
		}
		//Male or Female
		for(int i=0; i<a.length; i++ ) {
			if(a[i].isMale==true) {
			//	System.out.println("NAME: "+a[i].name.toUpperCase()+" "+"AGE: "+a[i].age+" "+"SALARY: "+a[i].salary+" "+"EXPERIENCE: "+a[i].experiance+" "+"ISMALE: "+a[i].isMale+"\n");
			}
		}
		//Experience 10% add
		for(int i=0; i<a.length; i++) {
			if(a[i].experiance>2.5) {
				int b=a[i].salary*10/100;
				a[i].salary=a[i].salary+b;
				//System.out.println(a[i].name+" "+a[i].salary+"\n");
			}
		}
		//Maximum Salary Details Object Method
		Employee max=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i].salary>max.salary) {
				max=a[i];
			}
		}
		//System.out.println("\n"+max.name+" "+max.age+" "+max.salary+" "+max.experiance+" "+max.isMale+"\n");
		//Maximum Salary Details Normal Method
		int max1=a[0].salary;
		int c1=0;
		for(int i=0; i<a.length; i++) {
			if(a[i].salary>max1) {
				max1=a[i].salary;
				c1=i;
			}
		}
		//System.out.println(a[c1].name+" "+a[c1].age+" "+a[c1].salary+" "+a[c1].experiance+" "+a[c1].isMale);
		int min=a[0].salary;
		int c2=0;
		for(int i=0; i<a.length; i++) {
			if(a[i].salary<min) {
				min=a[i].salary;
				c2=i;
			}
		}
		//System.out.println(a[c2].name+" "+a[c2].age+" "+a[c2].salary+" "+a[c2].experiance+" "+a[c2].isMale);
		//functions method
	}

}
