package prob14Test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import utilities.TestDataContext;
import utilities.Validation;
import prob14.Coins;

public class CoinsTest extends Coins {

	@Test
	public void CoinsSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("14");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> ammountList = ioData.readIntegerArrayList();

		ioData.writeIntegerArrayListToFileLineNew(returnAmmountOfCoins(ammountList));

	}

}
