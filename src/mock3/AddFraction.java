package mock3;

public class AddFraction {

	public static void main(String[] args) {
		int num1 = 1, den1 = 500, num2 = 2, den2 = 1500;
		System.out.print(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " is equal to ");
		addFraction(num1, den1, num2, den2);
	}

	private static void addFraction(int num1, int den1, int num2, int den2) {
		int resGCD = gcd(den1, den2);
		int lcm = (den1 * den2) / resGCD;

		int num3 = num1 * (lcm / den1) + num2 * (lcm / den2);
		lowest(num3, lcm);

	}

	private static void lowest(int num3, int lcm) {
		int common_fact = gcd(num3, lcm);
		num3 = num3 / common_fact;
		lcm = lcm / common_fact;
		System.out.println(num3 + "/" + lcm);
	}

	private static int gcd(int d1, int d2) {
		if (d1 == d2)
			return d1;
		if (d1 > d2)
			return gcd(d1 - d2, d2);
		else
			return gcd(d1, d2 - d1);
	}

}
