package prob04;

public class BubbleSort {

	public static Integer[] bubbleSort(Integer[] array) {

		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array.length; j++)

				if (array[i] < array[j]) {

					array[i] *= array[j];
					array[j] = array[i] / array[j];
					array[i] /= array[j];
				}
		return array;
	}

}
