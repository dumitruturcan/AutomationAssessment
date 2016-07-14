package prob10Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob10.LeapYears;
import utilities.TestDataContext;
import utilities.Validation;

public class LeapYearsTest  {

	@Test
	public void test() throws IOException {
		
		TestDataContext ioData = new TestDataContext("10");
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		int nrOfLeapYears = ioData.readOneInt();
		
		ArrayList<Integer> leapYears = LeapYears.returnLeapYearArrayList(nrOfLeapYears);
		
		ioData.writeIntegerArrayListToFileLineNew(leapYears);
	}

}
