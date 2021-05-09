package codeConvertInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

//Given the list of numbers, remove the duplicate elements from the list.
public class Java8_ex4 {

	public static void main(String[] args) {
		Integer[] arr = {100,24,13,44,114,200,40,112 };

		List<Integer> listWithDuplicates = Arrays.asList(arr);

		Set<Integer> result = listWithDuplicates.stream().collect(Collectors.toSet());

		result.forEach(s -> System.out.println(s));

		// squre of number
		OptionalDouble squareNumb = listWithDuplicates.stream().mapToInt(n -> n * n).filter(n -> n > 10000).average();
		if (squareNumb.isPresent())
			System.out.println(squareNumb.getAsDouble());

	}

}
