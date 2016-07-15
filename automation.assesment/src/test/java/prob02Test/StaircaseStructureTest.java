package prob02Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import utilities.TestDataContext;
import utilities.Validation;

import org.junit.Test;
import prob02.StaircaseStructure;

public class StaircaseStructureTest extends StaircaseStructure{

	@Test
	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext("02");

		assertTrue("No data in input file",Validation.fileNotEmpty(ioData));
		
		Integer nrOfLevels = ioData.readOneInt();

		ArrayList<String> tree = generateTreeList(nrOfLevels);

		ioData.writeArrayListToFileLineNew(tree);

	}

}
