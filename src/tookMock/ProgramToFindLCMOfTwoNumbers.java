package tookMock;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramToFindLCMOfTwoNumbers {

	public static int calculateLCM(int a, int b) {
		
		int max = Math.max(a, b);
		int temp = max;
		int lcm = 0;

		while (a != 0 && b!=0) {
			if ((max % a == 0) && (max % b == 0)) {
				lcm = max;
				break;
			}
			max += temp;
		}
		return lcm;
	}

	public static void main(String[] args) {
		int num1 = 4, num2 = 8;
		System.out.println("LCM of "+ num1+ " and " +num2 + " = " + calculateLCM(num1, num2));
	}
	
	@Test
	public	void test1() {
		assertEquals(35, ProgramToFindLCMOfTwoNumbers.calculateLCM(7, 5));
	}
	
	@Test
	public	void test2() {
		assertEquals(6, ProgramToFindLCMOfTwoNumbers.calculateLCM(6, 2));
	}
	

}