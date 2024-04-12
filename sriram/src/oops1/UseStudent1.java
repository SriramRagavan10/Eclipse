package oops1;
//Constructor
public class UseStudent1 {
	public static void main(String[] args) {
		Student1 s=new Student1("Suban", 25, "Journalism");
		System.out.println(s.name+" "+s.age+" "+s.course);
		Student1 m=new Student1();
		m.name="Needhi";
		m.age=25;
		m.course="Dance";
		System.out.println(m.name+" "+m.age+" "+m.course);
	}

}
