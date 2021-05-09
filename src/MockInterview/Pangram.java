package MockInterview;

//Code to tell whether a string is a Pangram or not?


import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		String str = "a quick brown fox jumps over the lazy do";
		System.out.println(checkPangram(str));
	}

	private static boolean checkPangram(String str) {

		boolean flag = false;
		String s = str.replace(" ", "");
		Set<Character> hs = new HashSet<>();
		char ar[] = s.toCharArray();
		for (char c : ar)
			hs.add(c);
		if (hs.size() == 26)
			flag = true;
		return flag;
	}

}
