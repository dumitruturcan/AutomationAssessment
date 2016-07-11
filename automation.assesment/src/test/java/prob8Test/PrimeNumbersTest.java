package prob8Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob08.PrimeNumbers;
import utilities.TestDataContext;
import utilities.Validation;

public class PrimeNumbersTest {

	@Test
	public void test() throws IOException {
		
		TestDataContext ioData = new TestDataContext(8);
		
		assertTrue("File has no data !",Validation.fileNotEmpty(ioData));
		
		int n =ioData.readOneInt();
		
		Integer[] primeArray = PrimeNumbers.returnPrimeNumbersArrayUntilN(n);
		
		ioData.writeArrayToFileInLine(primeArray);
	}

}
