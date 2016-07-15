package prob04;

import java.util.ArrayList;

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

	public static ArrayList<Integer> bubbleSortArrayList(ArrayList<Integer> list) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		Integer[] array = new Integer [list.size()];
		
		for(int i = 0; i <list.size(); i ++)
			array[i] = list.get(i);
		
		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array.length; j++)

				if (array[i] < array[j]) {

					array[i] *= array[j];
					array[j] = array[i] / array[j];
					array[i] /= array[j];
				}
		
		for (int i = 0; i < array.length; i ++)
			
			result.add(array[i]);
		
		return result;
	}
	
	
}
