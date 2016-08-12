package prob16Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Test;
import prob16.DoubleOrAdd;
import utilities.TestDataContext;
import utilities.Validation;

public class DoubleOrAddTest extends DoubleOrAdd {

	@Test
	public void DoubleOrAddSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("16");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> inputValues = ioData.readIntegerArrayList();

		ioData.writeIntegerArrayListToFileLineNew(retunrNumberOfMovesList(inputValues));
	}

}
