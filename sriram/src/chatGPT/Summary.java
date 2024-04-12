package chatGPT;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Summary {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer>a=Arrays.asList(10,25,64,542,98,5,236,356,9856,5,24,1);
			IntSummaryStatistics b=a.stream().mapToInt(x->x).summaryStatistics();
			System.out.println(b.getMax());
			System.out.println(b.getMin());
			System.out.println(b.getSum());
			System.out.println(b.getCount());
			System.out.println(b.getAverage());
	}
}