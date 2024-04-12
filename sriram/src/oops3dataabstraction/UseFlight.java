package oops3dataabstraction;

public class UseFlight {
	public static void main(String[] args) {
		Flight f1=new Flight();
		System.out.println(f1.findClass(2000));
		System.out.println(f1.findType(30));
	}

}
