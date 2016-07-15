package prob03Test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob03.InverseArray;
import utilities.TestDataContext;
import utilities.Validation;

public class InverseArrayTest extends InverseArray {

	@Test
	public void test() throws IOException {
		
		TestDataContext ioData = new TestDataContext("03");
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		ArrayList<Double> arrayList = ioData.readDoubleArrayList();
		
		Double[] array = arrayList.toArray(new Double [arrayList.size()]);
		
		inverseArray(array);
		
		ioData.writeArrayToFileInLine(array);
	}
}
