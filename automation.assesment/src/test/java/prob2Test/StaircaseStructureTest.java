package prob2Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import utilities.TestDataContext;
import utilities.Validation;

import org.junit.Test;
import prob02.StaircaseStructure;

public class StaircaseStructureTest {

	@Test
	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext(2);

		assertTrue(Validation.fileNotEmpty(ioData));
		
		Integer nrOfLevels = ioData.readOneInt();

		ArrayList<String> tree = StaircaseStructure.generateTreeList(nrOfLevels);

		ioData.writeArrayListToFileLineNew(tree);

	}

}
