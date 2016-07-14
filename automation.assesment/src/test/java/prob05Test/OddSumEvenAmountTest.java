package prob05Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob05.OddSumEvenAmount;
import utilities.TestDataContext;
import utilities.Validation;

public class OddSumEvenAmountTest {

	@Test
	public void test() throws IOException {
	
		TestDataContext ioData = new TestDataContext("05");
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		ArrayList<Integer> array = ioData.readIntegerArrayList();
		
		int oddSum = OddSumEvenAmount.oddSum(array);
		
		int evenAmount = OddSumEvenAmount.evenAmount(array);
		
		ioData.writeLine("Sum of Odd Numbers = "+oddSum+ "\nAmount of Even Numbers = "+evenAmount);
		
	}

}