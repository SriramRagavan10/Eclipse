package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Containing {
	public static void main(String[] args) {
		String[] words= {"Sriram", "Sri", "Rajalakshmi"};
		char x='a';
		List<Integer>s=new ArrayList<>();
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length(); j++) {
				if(words[i].charAt(j)==x) {
					s.add(i);
					break;
				}
			}
		}
		//List<Integer>num=s.stream().distinct().collect(Collectors.toList());
		System.out.println(s);
		
//		for(int i=0;i<words.length; i++){
//            if(words[i].indexOf(x)!= -1){
//                s.add(i);
//            }
//        }
//        System.out.printlm(s);
	}

}
