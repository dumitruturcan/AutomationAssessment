package prob20;

import java.util.ArrayList;

public class NonAdjacentSequence {

	public ArrayList<String> result(ArrayList<Integer> inputData) {

		ArrayList<String> sequences = new ArrayList<String>();

		for (Integer value : inputData)

				sequences.add(generateSequence(value));

		return sequences;
	}

	private String generateSequence(Integer value) {

		ArrayList<Integer> list = populateListWith(1, value);
		int size = list.size();
		String result = "";

		if(value > 4){
		
		for (int i = 0; i < size; i += 2)

			result += list.get(i) + " ";

		for (int i = 1; i < size; i += 2)

			result += list.get(i) + " ";
		}else
			
			result += -1+" ";
		
		return result;
	}

	private ArrayList<Integer> populateListWith(int start, Integer end) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = start; i <= end; i++)

			result.add(i);

		return result;
	}

}
