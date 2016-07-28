package prob12;

import prob07.MagicalSquare;

public class SortArrayByTheSunOnLines {

	public static Integer[][] sortDescArrayBySumOnLines(Integer[][] array) {

		int[] sumsPerLines = MagicalSquare.sumsPerRows(array);

		for (int x = 0; x < array.length; x++)
			for (int y = 0; y < array.length; y++) {

				if (sumsPerLines[x] > sumsPerLines[y]) {

					array = swap2DArrayLines(array, x, y);

					sumsPerLines[x] *= sumsPerLines[y];

					sumsPerLines[y] = sumsPerLines[x] / sumsPerLines[y];

					sumsPerLines[x] /= sumsPerLines[y];
				}

			}

		return array;
	}

	private static Integer[][] swap2DArrayLines(Integer[][] array, int x, int y) {

		for (int i = 0; i < array.length; i++) {

			array[x][i] *= array[y][i];
			array[y][i] = array[x][i] / array[y][i];
			array[x][i] /= array[y][i];

		}

		return array;
	}

}
