package SCB_Mock;

public class ReverseTheStringWithoutAffectingSpecialCharacter {

	public static void main(String[] args) {
		String s = "a!@bc&d";
		char charArray[] = s.toCharArray();
		reversStr(charArray);
		String revStr = new String(charArray);
		System.out.println(revStr);

	}

	private static void reversStr(char[] arr) {
		int h = arr.length - 1, l = 0;
		char tmp;

		while (l < h) {
			if (!Character.isAlphabetic(arr[l]))
				l++;
			else if (!Character.isAlphabetic(arr[h]))
				h--;
			else {
				tmp = arr[l];
				arr[l] = arr[h];
				arr[h] = tmp;
				l++;
				h--;
			}
		}

	}

}
