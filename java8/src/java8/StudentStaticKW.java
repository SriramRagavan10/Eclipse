package java8;

public class StudentStaticKW {
	String name;
	int age;
	static String college="SRM";
	public String toString() {
		return name+" "+age+" "+college;
	}
	static {
		System.out.println("Details");
	}
}
