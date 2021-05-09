package SCB_Mock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFindElement {

	@Test
	public void test() {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };

		assertEquals(8, FindTheElementFromShortedRotatedArr.search(arr, 0, 8, 3));
	}

	@Test
	public void test1() {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 4 };

		assertEquals(-1, FindTheElementFromShortedRotatedArr.search(arr, 0, 8, 3));
	}

	@Test
	public void test2() {
		int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 4 };

		assertEquals(-1, FindTheElementFromShortedRotatedArr.search(arr, 0, 8, -1));
	}

}
