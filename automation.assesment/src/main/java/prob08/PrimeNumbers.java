package prob08;

import java.util.ArrayList;

public class PrimeNumbers {

	public static ArrayList<Integer> returnPrimeNumbersArrayUntilN(int n) {

		ArrayList<Integer> primeList = new ArrayList<Integer>();

		if (n > 1) {

			primeList.add(2);

			for (int i = 3; i <= n; i += 2)

				if (isPrime(i))

					primeList.add(i);
		} else
			primeList.add(-1);

		return primeList;
	}

	private static boolean isPrime(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++)

			if (n % i == 0)

				return false;

		return true;

	}

}
