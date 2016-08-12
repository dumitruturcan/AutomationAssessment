package prob06Test;

import static org.junit.Assert.*;
import java.io.IOException;
import prob06.PIDigits;
import utilities.TestDataContext;
import utilities.Validation;

public class PIDigitsTest {

	// @Test
	public void PIDigitsSol1() throws IOException {

		fail("Solution is not ready");

		TestDataContext ioData = new TestDataContext("06");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		int nrOfDigits = ioData.readOneInt();

		double PI = PIDigits.generatePI(nrOfDigits);

		System.out.println(PI);

	}

}
