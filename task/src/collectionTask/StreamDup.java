package collectionTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDup {
	public static void main(String[] args) {
		String s="onesoft";
		char[] c=s.toCharArray();
		List<Character>cs=new ArrayList<>();
		for(int i=0; i<c.length; i++) {
			cs.add(c[i]);
		}
		//Dup and Non-Dup Count
//		Map<Character, Long>b=cs.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		b.forEach((x,y)-> System.out.print(x+"="+y+" "));
//		System.out.println();
		//s.chars().forEach(x->System.out.println(x));
		Map<Character,Long> res=s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		//Non-Dup Count
		//Map<Character, Long>f=cs.stream().filter(i->Collections.frequency(cs, i)==1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//f.forEach((x,y)-> System.out.print(x+"="+y+" "));
		System.out.println();
//		//Dup Count 
		Map<Character,Long> dub=res.keySet().stream().filter(x->res.get(x)>1).collect(Collectors.toMap(x->x,y->res.get(y)));
		Map<Character, Long>sr=cs.stream().filter(i->Collections.frequency(cs, i)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		sr.forEach((x,y)-> System.out.print(x+"="+y+" "));
//		System.out.println();
//		//Non-Dup Letters
		List<Character>nr=cs.stream().filter(i->Collections.frequency(cs, i)==1).collect(Collectors.toList());
		nr.forEach(x-> System.out.print(x+" "));
		System.out.println();
//		//Dup Letters
//		List<Character>nr1=cs.stream().filter(i->Collections.frequency(cs, i)>1).distinct().collect(Collectors.toList());
//		nr1.forEach(x-> System.out.print(x+" "));
	}
}
