package Test;

public class DecimalEqual {
	public static void main(String[] args) {
		float f1=10.25f;
		int v1=(int)f1;
		float f2=23.25f;
		int v2=(int)f2;
		if(f1%v1==f2%v2) {
			System.out.println("DECIMAL PARTS ARE EQUAL");
		}
		else {
			System.out.println("DECIMAL PARTS ARE NOT EQUAL");
		}
	}

}
