package mock3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingAnagrams {

	public static void main(String[] args) {
		String arr[] = { "cat", "dog", "tac", "god", "actc" };
		List<List<String>> result = new ArrayList<>();

		result = groupingAnagrams(arr);
		System.out.println(result);
	}

	private static List<List<String>> groupingAnagrams(String[] words) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> hm = new HashMap<>();

		for (String word : words) {
			char arr[] = new char[26];
			for (char c : word.toCharArray())
				arr[c - 'a']++;

			String key = new String(arr);
			
			List<String> list = new ArrayList<>();
			if (hm.containsKey(key))
				hm.get(key).add(word);
			else {
				list.add(word);
				hm.put(key, list);
			}
		}
		result.addAll(hm.values());

		return result;

	}

}
