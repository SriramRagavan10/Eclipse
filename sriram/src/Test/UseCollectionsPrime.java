package Test;
import java.util.ArrayList;
import java.util.List;
public class UseCollectionsPrime {
	public static void main(String[] args) {
		int[] a= {12, 3, 9, 7};
		CollectionsPrime cp=new CollectionsPrime();
		List<Integer>sum=new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			sum.add(a[i]);
		}
		for(int i=0; i<sum.size(); i++) {
			int c=0;
			for(int j=2; j<sum.get(i); j++) {
				if(sum.get(i)%j==0) {
					c++;
				}
			}
			if(cp.isPrime(c)) {
				System.out.print(sum.get(i)+"-NOT PRIME");
			}
			else {
				System.out.print(sum.get(i)+"-PRIME");
			}
			if(i<sum.size()-1) {
				System.out.print(", ");
			}
		}
	}
}
