package collectionTask;

import java.util.Arrays;
import java.util.List;

public class Count {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(4, 4, 5, 3);
		for(int i=0; i<num.size(); i++) {
			int c=1;
			int t=0;
			for(int j=i+1; j<num.size(); j++) {
				if(num.get(i)==num.get(j)) {
					c++;
					t=num.get(j)+num.get(i);
				}
			}
			if(c>1) {
				System.out.println("Sum: "+t+" "+"Count: "+c);
			}
		}
	}
}
