package prob4Test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob04.BubbleSort;
import utilities.TestDataContext;
import utilities.Validation;

public class BubbleSortTest {

	@Test
	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext(4);

		assertTrue(Validation.fileNotEmpty(ioData));

		ArrayList<Integer> arrayList = (ArrayList<Integer>) ioData.readIntegerArrayList();

		Integer[] array = arrayList.toArray(new Integer[arrayList.size()]);

		array = BubbleSort.bubbleSort(array);

		ioData.writeArrayToFileInLine(array);

	}

}
