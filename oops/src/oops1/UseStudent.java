package oops1;
//Encapsulation
public class UseStudent {
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Rythan");
		System.out.println(s.getName());
		s.setAge(24);
		System.out.println(s.getAge());
		s.setCourse("Musicial");
		System.out.println(s.getCourse());
		Student a=new Student();
		a.setName("Suban");
		System.out.println(a.getName());
		a.setAge(24);
		System.out.println(a.getAge());
		a.setCourse("Musicial");
		System.out.println(a.getCourse());
		Student[] s1= {s,a};
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[i].getName());
		}
	}

}
