package SCB_Mock;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestShiftZeros {

	@Test
	public void test() {
		int[] arr = {1,0,2,0,3,0};
		int[] actual = ShiftZerosLeft.shiftZeros(arr);
		int expected[] = {0,0,0,1,2,3};
		
		assertArrayEquals(expected, actual);
		
	}
	@Test
	public void test1() {
		int[] arr = {1,0,2,0,3,0};
		int expected[] = {1,2,0,0,0,3};
		
		assertFalse(ShiftZerosLeft.shiftZeros(arr).equals(expected));
		
	}
	
	@Test
	public void testEmpty() {
		int[] arr = {};
		int expected[] = {};
		
		assertArrayEquals(expected, ShiftZerosLeft.shiftZeros(arr));
		
	}	

}