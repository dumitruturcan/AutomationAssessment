package prob20Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob20.NonAdjacentSequence;
import utilities.TestDataContext;
import utilities.Validation;

public class NonAdjacentSequenceTest extends NonAdjacentSequence {

	@Test
	public void NonAdjacentSequenceSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("20");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> inputData = ioData.readIntegerArrayList();

		ioData.writeArrayListToFileLineNew(result(inputData));
	}

}
