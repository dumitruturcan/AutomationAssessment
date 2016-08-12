package prob12Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob07.MagicalSquare;
import prob12.SortArrayByTheSunOnLines;
import utilities.TestDataContext;
import utilities.Validation;

public class SortArrayByTheSunOnLinesTest {

	@Test
	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext("12");

		assertTrue("Input file has no data", Validation.fileNotEmpty(ioData));

		ArrayList<Integer> fileIntegers = ioData.readIntegerArrayList();

		assertTrue(Validation.isSquare(fileIntegers.size()));

		Integer[][] array = MagicalSquare.arrayListTo2DSquareArray(fileIntegers);

		array = SortArrayByTheSunOnLines.sortDescArrayBySumOnLines(array);

		ioData.write2DArray(array);

	}

}
