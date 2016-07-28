package prob11Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob11.MergeThreeAscendinglySortedArrays;
import utilities.TestDataContext;
import utilities.Validation;


public class MergeThreeAscendinglySortedArraysTest extends MergeThreeAscendinglySortedArrays{

	//@Test
	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext("11");
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		ArrayList<String> lines = ioData.readLineArrayList();
		
		Integer [][] structure = convertLinesTo2DArray(lines);
			
	}


}
