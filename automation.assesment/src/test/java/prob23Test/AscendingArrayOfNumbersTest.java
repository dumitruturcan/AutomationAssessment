package prob23Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob23.AscendingArrayOfNumbers;
import utilities.TestDataContext;
import utilities.Validation;

public class AscendingArrayOfNumbersTest extends AscendingArrayOfNumbers {

	/*
	 * Given an array of n integers, determine the minimum amount of integers to
	 * be removed from the array so that the remaining array forms an ascending
	 * sequence of numbers - the output should be the remaining ascending
	 * sequence
	 */

	@Test
	public void AscendingArraySol1() throws IOException {

		fail("Not Yet Implemented");

		TestDataContext ioData = new TestDataContext("23");
		Validation validate = new Validation(ioData);
		assertTrue("No data in input file", validate.fileNotEmpty(ioData));

		ArrayList<Integer> array = ioData.readIntegerArrayList();

		array = result(array);

	}

}
