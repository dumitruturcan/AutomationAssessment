package prob08;

import java.util.ArrayList;

public class PrimeNumbers {

	
	
	public static Integer[] returnPrimeNumbersArrayUntilN(int n) {

		ArrayList<Integer> primeList = null;

		for (int i = 1; i <= n; i++) {
			
			if (isPrime(i))
				
				primeList.add(i);
		}

		Integer[] primes = primeList.toArray( new Integer[primeList.size()]);
		
		return primes;
	}

	public static boolean isPrime(int n) {

		if (n < 2)
			return false;

		long maxIteration =  Math.round(Math.sqrt(n));

		for (int i = 2; i < maxIteration; i++) {

			if (n % i == 0)

				return false;
		}

		return true;

	}

}
