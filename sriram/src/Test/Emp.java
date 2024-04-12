package Test;

import java.util.List;
import java.util.stream.Collectors;

public class Emp {
	public void maxSalary(List<Integer> a) {
		List<Integer> max=a.stream().sorted().collect(Collectors.toList());
		System.out.println(max.get(max.size()-1));
	}
	public void minSalary(List<Integer> a) {
		List<Integer> min=a.stream().sorted().collect(Collectors.toList());
		System.out.println(min.get(0));
	}
	public void maxExp(List<Integer> a) {
		List<Integer> max=a.stream().sorted().collect(Collectors.toList());
		System.out.println(max.get(max.size()-1));
	}
	public void minExp(List<Integer> a) {
		List<Integer> max=a.stream().sorted().collect(Collectors.toList());
		System.out.println(max.get(0));
	}
}
