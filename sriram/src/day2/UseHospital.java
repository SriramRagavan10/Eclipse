package day2;

public class UseHospital {
	public static void main(String[]args) {
		Hospital hos1=new Hospital();
		hos1.name="Apollo";
		hos1.location="Chennai";
		hos1.isAvail24=true;
		Hospital hos2=new Hospital();
		hos2.name="Kauvery";
		hos2.location="Chennai";
		hos2.isAvail24=true;
		Hospital hos3=new Hospital();
		hos3.name="Sims";
		hos3.location="Chennai";
		hos3.isAvail24=true;
		String u1=hos1.name.toUpperCase()+" "+hos1.location.toUpperCase()+" "+hos1.isAvail24+"\n"+hos2.name.toUpperCase()+" "+hos2.location.toUpperCase()+" "+hos2.isAvail24+"\n"+hos3.name.toUpperCase()+" "+hos3.location.toUpperCase()+" "+hos3.isAvail24;
		String u2=hos2.name.toUpperCase()+" "+hos2.location.toUpperCase()+" "+hos2.isAvail24;
		String u3=hos3.name.toUpperCase()+" "+hos3.location.toUpperCase()+" "+hos3.isAvail24;
		System.out.println(u1+" "+u2+" "+u3);
		int l=hos3.location.length();
		System.out.println("\n"+l);
		boolean b=hos1.name.equals(hos2.name);
		System.out.println("\n"+b);
		
	}

}
