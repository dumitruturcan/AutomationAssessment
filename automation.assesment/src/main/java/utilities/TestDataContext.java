package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDataContext {

	private String folderPath;
	private File input;
	private File output;

	public TestDataContext(String probNumber) throws IOException {

		folderPath = "src/test/java/prob" + probNumber + "Test/";		

		input = new File(folderPath + "Input.txt");
		
		output = new File(folderPath + "Output.txt");
		
		if(input.exists() == false)
			input.createNewFile();

	}

	// ************************************************WRITE_METHODS************************************************

	public void writeArrayListToFileLineNew(ArrayList<String> array) throws IOException {

		FileWriter out = new FileWriter(output);

		for (String word : array)

			out.write(word + "\n");

		out.close();
	}
	
	public void writeArrayToFileInLine(Object[] array) throws IOException {
		
		FileWriter write = new FileWriter(output);
		
		for(int i =0; i < array.length; i ++)
			
			write.write(array[i]+" ");
		
		write.close();
		
	}
	
	public void writeLine(String line) throws IOException{
		
		FileWriter out = new FileWriter(output);
		
		out.write(line);
		
		out.close();
	}
	
	// ************************************************READ_METHODS*************************************************
	public Integer readOneInt() throws FileNotFoundException {

		Scanner scan = new Scanner(input);
		
		Integer value = null;

		if (scan.hasNextInt())

			value = scan.nextInt();

		scan.close();

		return value;
	}

	public Object readLineArrayList() throws FileNotFoundException {

		ArrayList<String> temp = new ArrayList<String>();
			
		Scanner scan = new Scanner(input);
	
		if (scan.hasNextLine()) {

			while (scan.hasNextLine())
				temp.add(scan.nextLine());
		} else {

			scan.close();
			return null;
		}
		scan.close();
		return temp;
	}

	public ArrayList<Integer> readIntegerArrayList() throws FileNotFoundException {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(input);
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		if (scan.hasNextInt())
			while (scan.hasNextInt())
				array.add(scan.nextInt());
			
		else return null;
		
		return array;
	}

	public ArrayList<Double> readDoubleArrayList() throws FileNotFoundException {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(input);
		ArrayList<Double> array = new ArrayList<Double>();
		
		if (scan.hasNextDouble())
			while (scan.hasNextDouble())
				array.add(scan.nextDouble());
			
		else return null;
		
		return array;
	}
	
	//***************************************************GETTERS****************************************************
	
	public File getInputFile(){
		return input;
	}
	
	public File getOutputFile(){
		return output;
	}

	

	//*************************************************FILE_UTILITIES************************************************
	
	
	
}
