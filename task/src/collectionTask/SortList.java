package collectionTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<String> let=Arrays.asList("a","b", "c", "d", "e", "f", "g", "h");
		List<Integer> nums=Arrays.asList(0, 1, 1, 0, 1, 2, 2, 0);
		
		Integer tempint = 0;
		String temp = "";
		
		for(int i = 0; i < nums.size(); i++) {
			for(int j = i+1; j < nums.size(); j++) {
				if(nums.get(i) > nums.get(j)) {
					tempint=nums.get(i);
					temp=let.get(i);
					nums.set(i, nums.get(j));
					let.set(i, let.get(j));
					nums.set(j, tempint);
					let.set(j, temp);
				}
			}
			System.out.print(let.get(i)+" ");
		}
		System.out.print("\n");
		List<String> sor=let.stream().sorted(Comparator.comparing(x->nums.get(let.indexOf(x)))).toList();
		sor.forEach(x->System.out.print(x+" "));
		
	}

}
