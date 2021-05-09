package tookMock;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class PrintAllPairsWithGivenSum {

	public static String findPair(int[] A, int sum) {
		StringBuffer str = new StringBuffer();
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("Pair of number Using Hash: ");
		for (int i = 0; i < A.length; i++) {
			int dif = sum - A[i];
			if (map.containsKey(dif)) {
				str.append("(" + dif + ", " + A[i] + ")");
			}
			if (!map.containsKey(A[i]))
				map.put(A[i], 1);
		}
		return str.toString();
	}

	public static void main(String[] args) {
		int[] A = { 1, 5, 7, -1, 2, 3, 4,6,0,3,-4,10 };
		int sum = 6;

		System.out.println(findPair(A, sum));

		findPairNlogN(A, sum);
	}

	public static void findPairNlogN(int[] A, int sum) {

		Arrays.sort(A);
		int low = 0;
		int high = A.length - 1;
		System.out.println("\nPair of number: ");
		while (low < high) {
			if (A[low] + A[high] == sum) {
				System.out.println("(" + A[low] + ", " + A[high] + ")");
			}

			if (A[low] + A[high] < sum) {
				low++;
			} else {
				high--;
			}
		}
	}
}

class PairsWithGivenSumTest {

	@Test
	void test() {
		String expected = "(1, 5)(7, -1)(1, 5)";
		int[] arr = { 1, 5, 7, -1, 5 };
		Assert.assertEquals(expected, PrintAllPairsWithGivenSum.findPair(arr, 6));
	}

	@Test
	void test2() {
		String expected = "(2, 5)";
		int[] arr = { 2, 5, 17, -1 };
		assertEquals(expected, PrintAllPairsWithGivenSum.findPair(arr, 7));
	}

}