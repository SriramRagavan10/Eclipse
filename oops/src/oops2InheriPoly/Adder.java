package oops2InheriPoly;
//Polymorphism Overloading-1
public class Adder {
	public String add(int a, int b) {
		return "Ans = "+(a+b);
	}
	public String add(int a, float b) {
		return "Ans = "+(a+b);
	}
	public String add(float a, long b) {
		return "Ans = "+(a+b);
	}
	public String add(long a, double b) {
		return "Ans = "+(a+b);
	}
	public String add(long a, int b, float c) {
		return "Ans = "+(a+b+c);
	}
	public String add(float a, float b, int c) {
		return "Ans = "+(a+b+c);
	}

}
