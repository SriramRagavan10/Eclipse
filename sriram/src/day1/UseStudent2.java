package day1;

public class UseStudent2 {
	public static void main(String[]args) {
		Student2 s1=new Student2();
		s1.studentName="Khan";
		s1.studentAge=17;
		s1.studentMobileNo=9871234567l;
		s1.classSection='A';
		s1.marksPercentage=81.3f;
		Student2 s2=new Student2();
		s2.studentName="Salman";
		s2.studentAge=17;
		s2.studentMobileNo=6788425595l;
		s2.classSection='B';
		s2.marksPercentage=77.2f;
		Student2 s3=new Student2();
		s3.studentName="Ranbir";
		s3.studentAge=17;
		s3.studentMobileNo=8345712293l;
		s3.classSection='E';
		s3.marksPercentage=90.5f;
		System.out.println(s1.studentName+" "+s1.studentAge+" "+s1.studentMobileNo+" "+s1.classSection+" "+s1.marksPercentage+"\n"+s2.studentName+" "+s2.studentAge+" "+s2.studentMobileNo+" "+s2.classSection+" "+s2.marksPercentage+"\n"+s3.studentName+" "+s3.studentAge+" "+s3.studentMobileNo+" "+s3.classSection+" "+s3.marksPercentage);
		
	}

}
