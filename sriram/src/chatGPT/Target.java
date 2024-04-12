package chatGPT;

import java.util.Arrays;
import java.util.List;

public class Target {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int targetSum = 5;

        List<List<Integer>>m=numbers.stream().flatMap(i -> numbers.stream().filter(j -> i + j == targetSum).map(j -> Arrays.asList(i,j))).toList();
    }

}
