package day2;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.model="XVI";
		car1.price=400000;
		car1.isPetrol=false;
		Car car2=new Car();
		car2.brand="tata";
		car2.model="IX";
		car2.price=300000;
		car2.isPetrol=true;
		Car car3=new Car();
		car3.brand="swift";
		car3.model="X2V";
		car3.price=200000;
		car3.isPetrol=true;
		int l1=car1.brand.length();
		int l2=car2.brand.length();
		int l3=car3.brand.length();
		int total=car1.price+car2.price+car3.price;
		String b1=car1.brand.toUpperCase();
		String b2=car2.brand.toUpperCase();
		String b3=car3.brand.toUpperCase();
		System.out.println(l1+" "+l2+" "+l3+"\n"+total+"\n"+b1+" "+b2+" "+b3);
	}

}
