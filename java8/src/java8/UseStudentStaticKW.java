package java8;

public class UseStudentStaticKW {
	public static void main(String[] args) {
		System.out.println(StudentStaticKW.college);//parent class value
		StudentStaticKW.college="St.John's";
		System.out.println(StudentStaticKW.college);//child class value
		StudentStaticKW s1= new StudentStaticKW();
		s1.name="Rythan";
		s1.age=26;
		s1.college="Bharathiyar";
		System.out.println(s1);//object value
		StudentStaticKW s2= new StudentStaticKW();
		s2.name="Suban";
		s2.age=26;
		s2.college="Kan";
		System.out.println(s2);
	}
}
