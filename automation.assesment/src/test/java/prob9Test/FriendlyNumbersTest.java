package prob9Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob09.FriendlyNumbers;
import utilities.TestDataContext;
import utilities.Validation;

public class FriendlyNumbersTest {

	@Test
	public void test() throws IOException {
	
		
		TestDataContext ioData = new TestDataContext(9);
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		int limit = ioData.readOneInt();
		
		ArrayList<Integer> pairNumbers  = FriendlyNumbers.returnFriendlyPairs(limit);
	}

}
