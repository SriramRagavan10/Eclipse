package forTask;

import java.util.Arrays;
import java.util.List;

public class StringInteger {
	public static void main(String[] args) {
		List<String> let=Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
		List<Integer> num=Arrays.asList(0,   1,   1,   0,   1,   2,   2,   0);
		int temp=0;
		String tem="";
		for(int i=0; i<num.size(); i++) {
			for(int j=i+1; j<num.size(); j++) {
				if(num.get(i)>num.get(j)) {
					temp=num.get(i);
					tem=let.get(i);
					
					num.set(i, num.get(j));
					let.set(i, let.get(j));
					
					num.set(j, temp);
					let.set(j, tem);
				}
			}
			System.out.print(let.get(i)+" ");
		}
	}

}
