package collectionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListDiagonal {
	public static void main(String[] args) {
		List<Integer> a1=Arrays.asList(1,2,3,4);
		List<Integer> a2=Arrays.asList(5,6,7,8);
		List<Integer> a3=Arrays.asList(1,2,3,4);
		List<Integer> a4=Arrays.asList(7,6,7,8);
		List<List<Integer>> a=new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
		Integer b=0;
		Integer c=0;
		for(int i=0; i<a.size(); i++) {
			b=b+a.get(i).get(i);
			c=c+a.get(i).get((a.size()-1)-i);
		}
		System.out.println(b);
		System.out.println(c);
//		IntStream.range(0,a.size()).map(x->{
//			int y=1*a.get(x).get(x);
//		}).forEach(x->System.out.println(x));
	}

}
