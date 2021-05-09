package mock3;

public class CheckIfANumberIsAPowerOfAnotherNumber {

	public static void main(String args[]) {

		boolean res = isPower(10, 1000);
		if (res)
			System.out.println("A power of another number: " + res);
		else
			System.out.println("A power of another number: " + res);
	}

	static boolean isPower(int x, int y) {

		while (y >= x && y % x == 0) {
			y /= x;
		}
		if (y == 1)
			return true;

		return false;

	}

}
