package prob11Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob11.MergeThreeAscendinglySortedArrays;
import utilities.TestDataContext;
import utilities.Validation;

public class MergeThreeAscendinglySortedArraysTest extends MergeThreeAscendinglySortedArrays {

	@Test
	public void MergeArraysSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("11");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<String> lines = ioData.readLineArrayList();

		ArrayList<ArrayList<Integer>> structure = convertLinesTo2DArray(lines);

		structure = sortLevels(structure);

		ArrayList<Integer> result = mergeArrayLists(structure);

		ioData.writeLine(result.toString());
	}

}
