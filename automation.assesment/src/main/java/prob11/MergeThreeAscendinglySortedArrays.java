package prob11;

import java.util.ArrayList;
import java.util.Scanner;
import prob04.BubbleSort;

public class MergeThreeAscendinglySortedArrays {

	public static ArrayList<ArrayList<Integer>> convertLinesTo2DArray(ArrayList<String> lines) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		Scanner scan;

		for (String line : lines) {

			scan = new Scanner(line);

			ArrayList<Integer> temp = new ArrayList<Integer>();

			while (scan.hasNextInt()) {

				temp.add(scan.nextInt());

			}

			result.add(temp);

		}

		return result;
	}

	public static ArrayList<ArrayList<Integer>> sortLevels(ArrayList<ArrayList<Integer>> array) {

		for (int i = 0; i < array.size(); i++) {

			array.add(BubbleSort.bubbleSortArrayList(array.get(0)));

			array.remove(0);
		}
		return array;
	}

	public static ArrayList<Integer> mergeArrayLists(ArrayList<ArrayList<Integer>> structure) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		structure = modifyStructureForSameLineSize(structure);

		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < structure.get(0).size(); i++) {

			for (int j = 0; j < structure.size(); j++) {

				Integer element = structure.get(j).get(i);

				if (element != null)

					temp.add(element);

			}

			temp = BubbleSort.bubbleSortArrayList(temp);

			for (Integer value : temp)
				result.add(value);

			temp = new ArrayList<Integer>();

		}

		return result;
	}

	private static ArrayList<ArrayList<Integer>> modifyStructureForSameLineSize(
			ArrayList<ArrayList<Integer>> structure) {

		int maxSize = structure.get(0).size();

		for (int i = 1; i < structure.size(); i++)

			if (structure.get(i).size() > maxSize)

				maxSize = structure.get(i).size();

		for (ArrayList<Integer> temp : structure) {

			if (temp.size() < maxSize) {

				while (temp.size() < maxSize)

					temp.add(null);

			}

		}

		return structure;
	}
}
