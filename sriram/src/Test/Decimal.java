package Test;

import java.text.DecimalFormat;

public class Decimal {
	public static void main(String[] args) {
		int a=10;
		//System.out.printf("%.2f"+a);
		DecimalFormat df=new DecimalFormat(".00");
		System.out.println(df.format(a));
	}

}
