package prob08Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob08.PrimeNumbers;
import utilities.TestDataContext;
import utilities.Validation;

public class PrimeNumbersTest {

	@Test
	public void PrimeNumbersSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("08");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		int n = ioData.readOneInt();

		ArrayList<Integer> primeArray = new ArrayList<Integer>();

		primeArray = PrimeNumbers.returnPrimeNumbersArrayUntilN(n);

		ioData.writeArrayToFileInLine(primeArray.toArray(new Integer[primeArray.size()]));

	}

}
