package collections2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapTask {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		map.put(1, "Onesoft");
		map.put(2, "Tech");       //1000    //1000     Mem=1=526
		map.put(3, "Vaan");       //1       //2        Mem=2=567
		map.put(4, "Suban");      //Onesoft //Tech
		System.out.println(map);  //526    //null
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.remove(1);
		System.out.println(map);
		map.replace(3, "Moon");
		System.out.println(map);
		map.put(0, "Sky");
		System.out.println(map.get(0));
		Iterator<Integer>he=map.keySet().iterator();
		int d=map.size()-1;
		while(he.hasNext()) {
			Integer val=he.next();
			System.out.print(map.get(val));
			if(d>0) {
				System.out.print(",");
			}
			d--;
		}
		
		
	}

}
