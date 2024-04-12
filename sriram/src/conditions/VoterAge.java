package conditions;

public class VoterAge {
	public static void main(String[]args) {
		int age=56;
		if (age>=18) {
			System.out.println("Eligible Vote");
		}
		else {
			System.out.println("Not Eligible Vote");
		}
	}
}