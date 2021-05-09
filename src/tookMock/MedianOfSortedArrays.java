package tookMock;
import static org.junit.Assert.*;
import org.junit.Test;

public class MedianOfSortedArrays {

	public static double findMedian(int[] arr1, int[] arr2) {
		int i =0, j = 0;
		double n = arr1.length;
		double m = arr2.length;
		int m1 = -1, m2 = -1;
		//Odd case
		if((n+m) % 2 != 0) {
			for(int k= 0; k<= (n+m)/2; k++) {
				if(i != n && j != m) {
					if(arr1[i] > arr2[j]) {
						m1 = arr2[j++];
					}
					else
						m1 = arr1[i++];
				}
				else if(i< n) 
					m1 = arr1[i++];
				else
					m1 = arr2[j++];
			}
			return m1;
		}
		else {
			for(int k= 0; k<= (n+m)/2; k++) {
				m2 = m1;
				if(i != n && j != m) {
					if(arr1[i] > arr2[j]) {
						m1 = arr2[j++];
					}
					else
						m1 = arr1[i++];
				}
				else if(i< n) 
					m1 = arr1[i++];
				else
					m1 = arr2[j++];
			}
			return (m1+m2)/2;
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1, 12, 15, 26, 38};
		int[] arr2 = {2, 13, 24};
		
		System.out.println("Median of arrays are: " + findMedian(arr1, arr2));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		int[] arr1 = {1, 12, 15, 26, 38};
		int[] arr2 = {2, 13, 24};
		double res = findMedian(arr1, arr2);
		assertEquals(14D, res);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public	void testEmptyArray() {
		int[] arr1 = {};
		int[] arr2 = {2, 13, 24};
		double res = findMedian(arr1, arr2);
		assertEquals(13D, res);
	}
	
}