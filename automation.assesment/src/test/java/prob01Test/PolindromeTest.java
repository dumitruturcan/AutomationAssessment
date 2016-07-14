package prob01Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob01.Polindrome;
import utilities.TestDataContext;
import utilities.Validation;

public class PolindromeTest extends Polindrome {

	@Test
	public void test() throws IOException {
		
		TestDataContext ioData = new TestDataContext("01");

		assertTrue("No data in input File",Validation.fileNotEmpty(ioData));
		
		@SuppressWarnings("unchecked")
		ArrayList<String> arrayList = (ArrayList<String>) ioData.readLineArrayList();

		arrayList = findPolindromesFromArrayList(arrayList);

		ioData.writeArrayListToFileLineNew(arrayList);

	}

}