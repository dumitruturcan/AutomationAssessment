package prob20;

import java.util.ArrayList;

public class HideNSeek {

	public static ArrayList<String> returnLastElement(int n, int step) {

		ArrayList<String> list = populateList(n);
		int stepIndex = 0;
		step--;

		while (list.size() > 0) {

			System.out.println(list);

			if (step <= list.size() && stepIndex + step < list.size()) {

				stepIndex += step;

				list.remove(stepIndex);

			} else if (step > list.size()) {

				int difference = Math.abs(stepIndex - (step % list.size()));

				list.remove(difference);
			} else if (list.size() > 2) {

				stepIndex = Math.abs(list.size() - stepIndex - step);
				
				if (stepIndex == list.size())
					stepIndex = 0;
					
				list.remove(stepIndex);

			} else {

				if (stepIndex % 2 == 0)
					list.remove(0);
				else
					list.remove(1);

			}
		}

		return list;
	}

	public static ArrayList<String> populateList(int n) {

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 1; i < n + 1; i++)
			list.add(i + "");

		return list;
	}

}
