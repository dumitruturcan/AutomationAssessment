package prob09;

import java.util.ArrayList;

public class FriendlyNumbers {

	public static ArrayList<String> returnFriendlyPairs(int limit) {

		ArrayList<String> friendlyPairs = new ArrayList<String>();
		ArrayList<Double> abundancy = returnAbundancyList(limit);

		for (int i = 0; i < abundancy.size(); i++)
			for (int j = i + 1; j < abundancy.size(); j++) {

				if (abundancy.get(i).equals(abundancy.get(j))) {

					friendlyPairs.add(i+1 + " " + (j+1));

				}
			}

		return friendlyPairs;
	}

	public static ArrayList<Double> returnAbundancyList(int limit) {

		ArrayList<Double> abundancy = new ArrayList<Double>();
		double abundancyValue = 0.0;

		for (int i = 1; i <= limit; i++) {

			abundancyValue = returnDivisorsSum(i) / i;

			abundancy.add(abundancyValue);
		}

		return abundancy;
	}

	public static double returnDivisorsSum(int limit) {

		int divisorsSum = 0;

		for (int i = 1; i <= limit / 2; i++)

			if (limit % i == 0)

				divisorsSum += i;

		return divisorsSum + limit;
	}

}
