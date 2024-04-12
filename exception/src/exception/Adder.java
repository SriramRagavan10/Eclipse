package exception;

public class Adder {
	public int add(int a, int b) {
		return (a+b);
	}
	public float add(int a, float b) {
		return a+b;
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
