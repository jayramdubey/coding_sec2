package mock3;

public class PangramOrNot {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";

		String str1 = "The quick brown fox jumps over the dog";
		int len = str.length();
		
		isItPangramOrNot(str, len);
	}

	private static void isItPangramOrNot(String str, int len) {
		int flag = 0;
		char arr[] = new char[26];
		for (char c : str.toLowerCase().toCharArray()) {
			if (c == ' ')
				continue;
			arr[c - 'a'] += 1;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) {
				flag = 1;
			}
		}
		if (flag == 1)
			System.out.println("Not a panagram");
		else
			System.out.println("A panagram");

	}

}
