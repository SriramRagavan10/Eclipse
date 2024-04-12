package oops1;

public class UseConstructorGet {
	public static void main(String[] args) {
		ConstructorGet s=new ConstructorGet("Suban", 25, "Journalism", 8.1f);
		System.out.println(s.getName()+" "+s.getAge()+" "+s.getCourse()+" "+s.getPercentage());
		
	}
}
