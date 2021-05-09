package tookMock;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumSubArrays {

	public static void main(String[] args) {
		int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };
		int len = arr.length;
		int maximumSubArray = maxSumSubArr(arr, len);
		System.out.println("Max sum of the arrays: " + maximumSubArray);

	}

	private static int maxSumSubArr(int[] arr, int len) {
		int res = arr[0];
		int maxEnding = arr[0];
		for (int i = 1; i < len; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);

			res = Math.max(maxEnding, res);
		}
		return res;
	}
	
	@Test
	public void test1(){
		int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };
		int expected= 6;
		int len = arr.length;
		int Actual = MaximumSubArrays.maxSumSubArr(arr, len);
		assertEquals(expected, Actual);
	}

}
