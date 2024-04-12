package forTask;

import java.util.Arrays;
import java.util.List;

public class Target {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8);
		int target=5;
		for(int i=0; i<num.size(); i++) {
			for(int j=i+1; j<num.size(); j++) {
				if(num.get(i)+num.get(j)==target) {
					System.out.println(num.get(i)+" "+num.get(j));
					System.out.println(num.get(j)+" "+num.get(i));
				}
			}
		}
	}

}
