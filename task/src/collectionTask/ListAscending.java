package collectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListAscending {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {6,2,5,3};
		List<Integer>num=new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			num.add(a[i]);
		}
		for(int i=0; i<b.length; i++) {
			num.add(b[i]);
		}
		List<Integer>n=num.stream().filter(x->Collections.frequency(num, x)==1).sorted().collect(Collectors.toList());
		//n.forEach(x->System.out.print(x));
		System.out.println(n);
		
//		System.out.print("{");
//		for(int i=0; i<n.size(); i++) {
//			int c=0;
//			for(int j=i+1; j<n.size(); j++) {
//				if(n.get(i)==n.get(j)) {
//					n.set(j,0);
//					c++;
//				}
//			}
//			if(c==0 && n.get(i)!=0) {
//				System.out.print(n.get(i));
//			}
//			if(i>=n.size()/2 && n.get(i)<n.get(n.size()-1)) {
//				System.out.print(", ");
//			}
//		}
//		System.out.print("}");
	}


}
