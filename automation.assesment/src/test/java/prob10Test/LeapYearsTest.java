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
	public void LeapYearsSol1() throws IOException {
		
		TestDataContext ioData = new TestDataContext("10");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));
		
		int nrOfLeapYears = ioData.readOneInt();
		
		ArrayList<Integer> leapYears = LeapYears.returnLeapYearArrayList(nrOfLeapYears);
		
		ioData.writeIntegerArrayListToFileLineNew(leapYears);
	}

}
