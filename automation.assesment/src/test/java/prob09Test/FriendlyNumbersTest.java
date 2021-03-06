package prob09Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob09.FriendlyNumbers;
import utilities.TestDataContext;
import utilities.Validation;

public class FriendlyNumbersTest {

	@Test
	public void FriendlyNumbersSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("09");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		int limit = ioData.readOneInt();

		ArrayList<String> friendlyPairNumbers = FriendlyNumbers.returnFriendlyPairs(limit);

		ioData.writeArrayListToFileLineNew(friendlyPairNumbers);
	}

}
