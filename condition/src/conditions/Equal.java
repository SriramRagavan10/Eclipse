package conditions;

public class Equal {
	public static void main(String[]args) {
		String a="Sriram";
		if(a.equals("sriram")) {
			System.out.println("Correct");
		}
		else if(a.equalsIgnoreCase("sriram")) {
			System.out.println("Name Correct");
		}
		else {
			System.out.println("Incorrect");
		}
	}

}
