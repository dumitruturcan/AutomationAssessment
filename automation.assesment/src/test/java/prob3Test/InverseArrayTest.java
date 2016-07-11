package prob3Test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import prob03.InverseArray;
import utilities.TestDataContext;
import utilities.Validation;

public class InverseArrayTest {

	@Test
	public void test() throws IOException {
		
		TestDataContext ioData = new TestDataContext(3);
		
		assertTrue(Validation.fileNotEmpty(ioData));
		
		ArrayList<Double> arrayList = ioData.readDoubleArrayList();
		
		Double[] array = arrayList.toArray(new Double [arrayList.size()]);
		
		InverseArray.inverseArray(array);
		
		ioData.writeArrayToFileInLine(array);
	}
}
