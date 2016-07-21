package prob23Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob23.AscendingArrayOfNumbers;
import utilities.TestDataContext;
import utilities.Validation;

public class AscendingArrayOfNumbersTest extends AscendingArrayOfNumbers{

	@Test
	public void test() throws IOException {
	
		TestDataContext ioData = new TestDataContext("23");
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		ArrayList<Integer> array = ioData.readIntegerArrayList();
		
		array = result(array);
		
	}

}
