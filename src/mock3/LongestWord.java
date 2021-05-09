package mock3;

public class LongestWord {

	public static void main(String[] args) {
		String str[] = { "jay", "vijay", "Anil", "shreekant", "siya" };
		longestString(str);
	}

	private static void longestString(String[] words) {

		String result = "";
		int maxLen = 0;
		for (String word : words) {
			int len = word.length();
			if (maxLen < len) {
				maxLen = len;
				result = word;
			}
		}
		System.out.println("longest word in a given String: " + result);
	}

}
