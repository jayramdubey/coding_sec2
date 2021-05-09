package mock3;

public class MinimumDistanceBetweenWordsOfAString {

	public static void main(String[] args) {
		String givenStrin = "geeks for geeksa contribute practice geeks";
		String w1 = "geeks";
		String w2 = "practice";
		int result = distance(givenStrin, w1, w2);
		System.out.println("Minimum Distance Between Words of a Strin: " + result);
	}

	public static int distance(String str, String w1, String w2) {

		if (w1.equals(w2)) {
			return 0;
		}
		String[] words = str.split(" ");
		int len = words.length;

		int minDistance = len + 1, tmpDistance = len + 2;

		int p1 = -1, p2 = -1, i = 0;

		for (i = 0; i < len; i++) {

			if (words[i].equals(w1)) {
				p1 = i;
			}
			if (words[i].equals(w2)) {
				p2 = i;
			}
			if (p1 != -1 && p2 != -1) {
				tmpDistance = Math.abs(p1 - p2)-1;

				if (tmpDistance < minDistance)
					minDistance = tmpDistance;
			}
			if(minDistance==0)
				return minDistance;
		}
		return minDistance;
	}

}
