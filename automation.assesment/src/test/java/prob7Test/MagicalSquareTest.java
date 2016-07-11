package prob7Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob07.MagicalSquare;
import utilities.TestDataContext;
import utilities.Validation;

public class MagicalSquareTest {

	@Test
	public void test() throws IOException {

		TestDataContext ioData = new TestDataContext(7);

		assertTrue("Input.txt has no data",Validation.fileNotEmpty(ioData));

		ArrayList<Integer> array = ioData.readIntegerArrayList();

		assertTrue("Not a square",Math.sqrt(array.size())%1 == 0);
		
		Integer[][] square = MagicalSquare.arrayListTo2DSquareArray(array);
	 	
		if (MagicalSquare.isMagicalSquare(square))
			ioData.writeLine("Is a magical Square");
		else
			ioData.writeLine("Is NOT a magical Square");
		}
	}

