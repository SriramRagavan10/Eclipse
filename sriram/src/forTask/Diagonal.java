package forTask;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diagonal {
	public static void main(String[] args) {
		List<List<Integer>> nums=Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8), Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8));
		//OR
//		List<List<Integer>> nums=new ArrayList<>();
//		nums.add(Arrays.asList(1,2,3,4));
//		nums.add(Arrays.asList(5,6,7,8));
//		nums.add(Arrays.asList(1,2,3,4));
//		nums.add(Arrays.asList(5,6,7,8));
		Integer num=0;
		for(int i=0; i<nums.size(); i++) {
			num=num+nums.get(i).get(i);
		}
		System.out.println(num);
	}
}
