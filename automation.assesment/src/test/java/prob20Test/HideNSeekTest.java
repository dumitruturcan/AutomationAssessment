package prob20Test;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;
import prob20.HideNSeek;
import utilities.TestDataContext;
import utilities.Validation;

public class HideNSeekTest extends HideNSeek {

	@Test

	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext("20");

		assertTrue(Validation.fileNotEmpty(ioData));

		int n = ioData.readIntegerArrayList().get(0);

		int p = ioData.readIntegerArrayList().get(1);

		ioData.writeArrayListToFileLineNew(returnLastElement(n, p));
	}

}
