package prob06Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import prob06.PIDigits;
import utilities.TestDataContext;
import utilities.Validation;

public class PIDigitsTest {

	//@Test
	public void test() throws IOException {
		
		fail("Solution is not ready");
		
		TestDataContext ioData = new TestDataContext("06");
		
		assertTrue("Input file has no data",Validation.fileNotEmpty(ioData));
		
		int nrOfDigits = ioData.readOneInt();
		
		double PI = PIDigits.generatePI(nrOfDigits);
		
		System.out.println(PI);
		
	}

}
