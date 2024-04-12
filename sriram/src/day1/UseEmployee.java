package day1;

public class UseEmployee {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.id=19823;
		e1.name="Subash";
		e1.dob="10/11/1992";
		e1.mobileNo=9876987654l;
		Employee e2=new Employee();
		e2.id=19824;
		e2.name="Aravind";
		e2.dob="10/02/2000";
		e2.mobileNo=9567851234l;
		System.out.println(e1.id+" "+e1.name+" "+e1.dob+" "+"+91"+" "+e1.mobileNo+"\n"+e2.id+" "+e2.name+" "+e2.dob+" "+"+91"+" "+e2.mobileNo);
	}

}
