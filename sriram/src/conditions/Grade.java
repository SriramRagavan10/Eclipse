package conditions;

public class Grade {
	public static void main (String[]args) {
		int a=-1;
		if(a>=90&&a<=100) {
			System.out.println("O Grade");
		}
		else if(a>=80&&a<90) {
			System.out.println("A Grade");
		}
		else if(a>=60&&a<80) {
			System.out.println("B Grade");
		}
		else if(a>=50&&a<60) {
			System.out.println("Average");
		}
		else if(a>=30&&a<50) {
			System.out.println("Below Average");
		}
		else if(a<30) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
