package oops1;

public class UseConstructorGet {
	public static void main(String[] args) throws Exception {
		ConstructorGet s=new ConstructorGet("Suban", 25, "Journalism", 8.1f);
		System.out.println(s.getName()+" "+s.getAge()+" "+s.getCourse()+" "+s.getPercentage());
		if(s.getAge()>20) {
			throw new ConstructorGet();
		}
	}
}
