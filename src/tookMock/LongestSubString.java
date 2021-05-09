package tookMock;

/*E.g,: input = "abbbccda"
output = [1,3]
Testcases were
    1) input = "", output = [-1,0]
    2) input = "100001011", output = [1,4]
    3) input = "aabbbbbCDaA", output = [2,5]*/

public class LongestSubString {

	public static void findLongestSubstring(String str) {
		int maxLen = 0;
		int startIndex = -1;
		int  len = str.length();

		for (int i = 0; i < len; i++) {
			int count = 1;
			while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			if (maxLen < count) {
				maxLen = count;
				startIndex = i - maxLen + 1;
			}
		}
		System.out.println("[" + startIndex + ", " + maxLen + "]");
	}

	public static void main(String[] args) {
		String str = "100001011";
		findLongestSubstring(str);

	}

}
