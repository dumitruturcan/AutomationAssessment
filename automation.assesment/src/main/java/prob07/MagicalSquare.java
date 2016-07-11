package prob07;

import java.util.ArrayList;

public class MagicalSquare {

	public static Integer[][] arrayListTo2DSquareArray(ArrayList<Integer> array) {

		int size = array.size();

		int squareSize = (int) Math.sqrt(size);
		int k = 0;
		Integer[][] square = new Integer[squareSize][squareSize];

		for (int i = 0; i < squareSize; i++)
			for (int j = 0; j < squareSize; j++)

				square[i][j] = array.get(k++);

		return square;
	}

	public static boolean isMagicalSquare(Integer[][] square) {

		int magicValue = sumPerMainDiagonal(square);
		int[] rowSumsArray = null, colSumsArray;
		boolean result = false;

		if (magicValue == sumPerSecondDiagonal(square))

			rowSumsArray = sumsPerRows(square);
		colSumsArray = sumsPerColumns(square);

		for (int i = 0; i < square.length; i++)

			if (rowSumsArray[i] == colSumsArray[i] && rowSumsArray[i] == magicValue)

				result = true;
			else
				
				return false;
		
		return result;
	}

	private static int[] sumsPerColumns(Integer[][] square) {

		int[] results = new int[square.length];

		for (int row = 0; row < square.length; row++)
			for (int column = 0; column < square.length; column++)

				results[row] += square[row][column];

		return results;

	}

	private static int sumPerSecondDiagonal(Integer[][] square) {

		int sum = 0;
		int j = square.length - 1;

		for (int i = 0; i < square.length; i++)

			sum += square[i][j--];

		return sum;
	}

	private static int sumPerMainDiagonal(Integer[][] square) {

		int sum = 0;

		for (int i = 0; i < square.length; i++)

			sum += square[i][i];

		return sum;
	}

	private static int[] sumsPerRows(Integer[][] square) {

		int[] results = new int[square.length];

		for (int row = 0; row < square.length; row++)
			for (int column = 0; column < square.length; column++)

				results[row] += square[row][column];

		return results;
	}

}
