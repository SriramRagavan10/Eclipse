package Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionsEven {
	public static void main(String[] args) {
		int[] a= {4, 15, 76, 97, 108};
		String[] b= {"Blue", "Black", "White", "Red", "Yellow"};
		List<String>color=new ArrayList<>();
		List<Integer>num=new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			num.add(a[i]);
			color.add(b[i]);
		}
		num.stream().map(x->{if(x%2==0) {
			return x+"-EVEN";
		}
		else {
			return x+"-ODD";
		}
		}).forEach(x->System.out.println(x));
	}

}
