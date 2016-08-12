package prob18;

import java.util.ArrayList;

public class HideNSeek {

	public static ArrayList<Integer> returnLastElementsList(ArrayList<Integer> inputsList) {

		ArrayList<Integer> resultsList = new ArrayList<Integer>();
		
		for (int i = 0; i < inputsList.size(); i+=2){
			
			int n = inputsList.get(i);
			
			int step = inputsList.get(i+1);
			
			resultsList.add(test(n, step));
		}
		return resultsList;
	}

	public static Integer test(int n, int step) {

		ArrayList<Integer> list = populateList(n);
		step--;

		do {

			if (list.size() > step) {

				list.remove(step);

				list = rotateListWithKElements(step, list);

			} else if (list.size() <= step) {

				int temp = step % list.size();

				list = rotateListWithKElements(temp, list);

				list.remove(0);

			}

		} while (list.size() > 1);
		
		return list.get(0);
	}

	public static ArrayList<Integer> rotateListWithKElements(int k, ArrayList<Integer> list) {

		for (int i = 0; i < k; i++) {

			list.add(list.get(0));

			list.remove(0);

		}
		return list;

	}

	public static ArrayList<Integer> populateList(int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < n + 1; i++)
			list.add(i);

		return list;
	}

}
