package day1;

public class UseMarker {
	public static void main(String[]args) {
		Marker m1=new Marker();
		m1.price=20;
		m1.colour="Black";
		m1.weight=2.5f;
		m1.isQulity="First Class";
		Marker m2=new Marker();
		m2.price=25;
		m2.colour="Blue";
		m2.weight=2.7f;
		m2.isQulity="First Clas";
		Marker m3=new Marker();
		m3.price=22;
		m3.colour="Red";
		m3.weight=2.9f;
		m3.isQulity="Second Class";
		System.out.println(m1.price+" "+m1.colour+" "+m1.weight+" "+m1.isQulity+"\n"+m2.price+" "+m2.colour+" "+m2.weight+" "+m2.isQulity+"\n"+m3.price+" "+m3.colour+" "+m3.weight+" "+m3.isQulity);
	}

}
