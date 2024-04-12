package oops3dataabstraction;

public class UseComputer {
	public static void main(String[] args) {
		Computer com=new Computer();
		System.out.println(com.findOs("Windows 11"));
		System.out.println(com.findRamSize(16));
		System.out.println(com.findAntiVirus(true));
	}

}
