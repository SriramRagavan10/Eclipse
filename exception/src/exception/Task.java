package exception;

public class Task {
	public String add() {
		//System.out.println("Hello");
		return add();
	}
	public static void main(String[] args) {
		try {
		Task t=new Task();
		System.out.println(t.add());
		}
		finally {
			System.out.println("Hi");
		}
	}
}
