package tookMock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<String> inputList = Arrays.asList(input);
		groupAnagrams(inputList);

	}

	private static void groupAnagrams(List<String> inputList) {
		
		Set<Set<String>> res = new HashSet<>();

		Map<String, Set<String>> resmap = inputList.stream().collect(Collectors.groupingBy(s -> {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			return new String(c);
		}, Collectors.mapping(Function.identity(), Collectors.toSet())));
		resmap.forEach((k, v) -> res.add(v));
		System.out.println(res);
	}

}
