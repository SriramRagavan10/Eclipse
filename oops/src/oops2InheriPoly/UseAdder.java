package oops2InheriPoly;
//Polymorphism Overloading-1
public class UseAdder {
	public static void main(String[] args) {
		Adder add=new Adder();
		System.out.println(add.add(2.5f, 3.5f, 24)+"\n"+add.add(99769915466l, 85084.31544d));
		System.out.println(add.add(1,20));
	}

}
