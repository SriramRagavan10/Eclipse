package collectionTask;

import java.util.Arrays;
import java.util.List;

public class StreamTarget {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		for(int i=0; i<num.size(); i++) {
//			for(int j=i+1; j<num.size(); j++) {
//				if(num.get(i)+num.get(j)==5) {
//					System.out.println(num.get(i)+" "+num.get(j));
//					System.out.println(num.get(j)+" "+num.get(i));
//				}
//			}
//		}
		List<String> m=num.stream().map(x-> {
			String c="";
			for(int i=num.size()-1; i>=0; i--) {
				if(x+num.get(i)==5) {
					c=""+x+" "+num.get(i);
				}
				}
			 return c;
			}).toList();
		m.forEach(x->System.out.println(x));
	}
}
