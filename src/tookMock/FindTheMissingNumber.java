package tookMock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		List<Integer> miss = getMissingNo(a);
		System.out.println("missing number is: " + miss);

	}

	private static List<Integer> getMissingNo(int[] ar) {

		List<Integer> listMissingNo = new ArrayList<>();
		Set<Integer> hs = new HashSet<>();
		for (int num : ar)
			hs.add(num);

		int expectedNumCount = ar.length + 1;
		for (int i = 0; i < expectedNumCount; i++) {
			if (!hs.contains(i)) {
				listMissingNo.add(i);

			}
		}
		return listMissingNo;

	}

}
