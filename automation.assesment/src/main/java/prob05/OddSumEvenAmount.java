package prob05;

import java.util.ArrayList;

public class OddSumEvenAmount {

	public static Integer evenAmount(ArrayList<Integer> array) {
		Integer amount = 0;

		for (Integer listNumber : array)

			if (listNumber % 2 == 0)

				amount++;

		return amount;
	}

	public static Integer oddSum(ArrayList<Integer> array) {

		Integer sum = 0;

		for (Integer listNumber : array)

			if (listNumber % 2 != 0)

				sum += listNumber;

		return sum;
	}

}
