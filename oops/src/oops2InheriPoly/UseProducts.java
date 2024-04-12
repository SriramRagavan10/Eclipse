package oops2InheriPoly;

public class UseProducts {
	public static void main(String[] args) {
		Milk m=new Milk("Cow Milk", 8, "Aavin", 35);
		Salt s=new Salt("Rock Salt", 15, "TATA", 23);
		System.out.println(m+", "+m.findLitre(m.getPrice())+", "+m.findType(m.getProductId())+"\n"+s+", "+s.findKiloGram(s.getPrice())+", "+s.findType(s.getProductId()));
	}

}
