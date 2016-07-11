package prob02;

import java.util.ArrayList;

/* CONDITION: Drawing a staircase structure - given the required height, output a staircase as shown in the example
 * 
 * Given n = 6, the output should be:
     #
    # #
   # # #
  # # # #
 # # # # #
# # # # # #
 * 
 * */
public class StaircaseStructure {

	public static ArrayList<String> generateTreeList(int nrOfLevels) {

		ArrayList<String> tree = new ArrayList<String>();

		for (int treeLevelIndex = 1; treeLevelIndex < nrOfLevels + 1; treeLevelIndex++)

			tree.add(generateTreeLevel(treeLevelIndex, nrOfLevels));

		return tree;
	}

	private static String generateTreeLevel(int nrOfCharacters, int nrOfLevels) {

		String treeLevel = "";
		String space = " ";
		String character = "# ";
		int nrOfSpaces = nrOfLevels - nrOfCharacters;

		treeLevel += returnNStrings(space, nrOfSpaces);
		
		treeLevel += returnNStrings(character, nrOfCharacters);
		
		return treeLevel;
	}

	private static String returnNStrings(String character, int nr) {

		String str = "";

		for (int i = 0; i < nr; i++)

			str+= character;
		
		return str;
	}
}
