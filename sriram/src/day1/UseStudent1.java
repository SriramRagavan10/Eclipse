package day1;

public class UseStudent1 {
	public static void main(String[]args) {
		Student1 s1=new Student1();
		s1.name="Siva";
		s1.id=234;
		s1.age=14;
		s1.std="IX";
		s1.attendencePercentage=75;
		s1.totaldays=240;
		s1.noofDaysPresent=s1.totaldays*s1.attendencePercentage/100;
		Student1 s2=new Student1();
		s2.name="Mari";
		s2.id=236;
		s2.age=15;
		s2.std="X";
		s2.attendencePercentage=80;
		s2.totaldays=240;
		s2.noofDaysPresent=s2.totaldays*s2.attendencePercentage/100;
		Student1 s3=new Student1();
		s3.name="Valli";
		s3.id=237;
		s3.age=13;
		s3.std="VIII";
		s3.attendencePercentage=90;
		s3.totaldays=240;
		s3.noofDaysPresent=s3.totaldays*s3.attendencePercentage/100;
		System.out.println(s1.noofDaysPresent+"\n"+s2.noofDaysPresent+"\n"+s3.noofDaysPresent);
		
	}

}
