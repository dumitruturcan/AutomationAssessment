package utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Validation {

	private static TestDataContext ioDataContext;

	public Validation(TestDataContext ioData) {

		ioDataContext = ioData;

	}

	public boolean fileNotEmpty(TestDataContext ioData) throws IOException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(ioData.getInputFile());

		if (scan.hasNextLine())

			return true;

		else {
			writeNegativeCaseToOutputFile();
			return false;
		}
	}

	public boolean isSquare(Integer n) throws IOException {

		if (Math.sqrt(n) % 1 == 0)

			return true;

		else

			writeNegativeCaseToOutputFile();

		return false;
	}

	public boolean isPare(Integer n) throws IOException {

		if (n % 2 == 0)

			return true;

		else

			writeNegativeCaseToOutputFile();

		return false;
	}

	public boolean isGratherThen(int n, int k) throws IOException {

		if (n > k)

			return true;

		else

			writeNegativeCaseToOutputFile();

		return false;
	}

	private void writeNegativeCaseToOutputFile() throws IOException {

		FileWriter write = new FileWriter(ioDataContext.getOutputFile());
		write.write("-1");
		write.close();

	}
}
