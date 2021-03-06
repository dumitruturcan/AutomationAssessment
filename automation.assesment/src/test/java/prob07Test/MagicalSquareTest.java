package prob07Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob07.MagicalSquare;
import utilities.TestDataContext;
import utilities.Validation;

public class MagicalSquareTest {

	@Test
	public void MagicalSquareSol1() throws IOException {

		TestDataContext ioData = new TestDataContext("07");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> array = ioData.readIntegerArrayList();

		assertTrue("Not a square",validate.isSquare(array.size()));
		
		Integer[][] square = MagicalSquare.arrayListTo2DSquareArray(array);
	 	
		if (MagicalSquare.isMagicalSquare(square))
			ioData.writeLine("Is a magical Square");
		else
			ioData.writeLine("Is NOT a magical Square");
		}
	}

