package java8;

import java.util.Optional;

//optional class
public class Names {
	public static void main(String[] args) throws Exception {
		String a=null;
		String b="Mozhiyaal";
		Optional<String>check=Optional.ofNullable(a);
		Optional<String>check1=Optional.ofNullable(b);
		System.out.println(check);
		System.out.println(check1);
		System.out.println(check1.isEmpty());
		System.out.println(check.isPresent());
		System.out.println(check.orElse(b));
		//System.out.println(check.orElseThrow());
		//System.out.println(check.orElseThrow(()-> new NullPointerException()));
		System.out.println(check1.get());
	}
}
