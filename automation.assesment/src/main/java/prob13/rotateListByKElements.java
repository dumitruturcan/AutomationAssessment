package prob13;

import java.util.ArrayList;

public class rotateListByKElements {

	public static ArrayList<Integer> rotate(ArrayList<Integer> list, int counter) {

		while (counter > 0) {

			list.add(list.get(0));

			list.remove(0);

			counter--;

		}

		return list;
	}
}
