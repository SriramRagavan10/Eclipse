package forTask;

import java.util.Arrays;
import java.util.List;

public class IntDupCouSum {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(4,4,5,3);
		for(int i=0; i<num.size(); i++) {
			int c=1;
			int sum=0;
			for(int j=i+1; j<num.size(); j++) {
				if(num.get(i)==num.get(j)) {
					c++;
					sum=num.get(j)+num.get(j);
				}
			}
			if(c>1) {
				System.out.println("Sum="+sum+" "+"Count="+c);
			}
		}
	}

}
