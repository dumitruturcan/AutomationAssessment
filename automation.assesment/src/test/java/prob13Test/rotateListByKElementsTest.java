package prob13Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob13.rotateListByKElements;
import utilities.TestDataContext;
import utilities.Validation;

public class rotateListByKElementsTest extends rotateListByKElements {

	@Test
	public void rotateListSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("13");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> list = ioData.readIntegerArrayList();

		int k = list.get(0);
		list.remove(0);

		list = rotate(list, k);

		ioData.writeArrayToFileInLine(list.toArray());
	}

}
