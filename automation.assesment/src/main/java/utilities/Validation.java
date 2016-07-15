package utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Validation {

	public static boolean fileNotEmpty(TestDataContext ioData) throws IOException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(ioData.getInputFile());

		if (scan.hasNextLine())

			return true;

		else {
			FileWriter write = new FileWriter(ioData.getOutputFile());
			write.write("-1");
			write.close();
			return false;
		}
	}

	
	
}
