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
	public void SortBySumOnLinesSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("12");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> fileIntegers = ioData.readIntegerArrayList();

		assertTrue(validate.isSquare(fileIntegers.size()));

		Integer[][] array = MagicalSquare.arrayListTo2DSquareArray(fileIntegers);

		array = SortArrayByTheSunOnLines.sortDescArrayBySumOnLines(array);

		ioData.write2DArray(array);

	}

}
