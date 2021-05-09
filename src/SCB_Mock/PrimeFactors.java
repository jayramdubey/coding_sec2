package SCB_Mock;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static void main(String[] args) {

		System.out.print(primeFactors(2310));
		System.out.print(primeFactorsM2(2310));
	}

	private static List<Integer> primeFactorsM2(int num) {
		List<Integer> res = new ArrayList<>();

		while (num % 2 == 0) {
			res.add(2);
			num /= 2;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			while (num % i == 0) {
				res.add(i);
				num /= i;
			}
		}

		if (num > 2)
			res.add(num);

		return res;
	}

	public static List<Integer> primeFactors(long number) {
		List<Integer> primefactors = new ArrayList<>();

		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				primefactors.add(i);
				number /= i;
				i--;
			}
		}
		return primefactors;
	}
}


class Test{
	
}