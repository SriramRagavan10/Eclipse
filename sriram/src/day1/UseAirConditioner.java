package day1;

public class UseAirConditioner {
	public static void main(String[]args) {
		AirConditioner a1=new AirConditioner();
		a1.brand="Onida";
		a1.price=60000;
		a1.noOfWings=2;
		a1.isQuality=4;
		AirConditioner a2=new AirConditioner();
		a2.brand="Sony";
		a2.price=75000;
		a2.noOfWings=1;
		a2.isQuality=3;
		System.out.println(a1.brand+" "+a1.price+" "+a1.noOfWings+" "+a1.isQuality+"\n"+a2.brand+" "+a2.price+" "+a2.noOfWings+" "+a2.isQuality);
	}

}
