package prob06;

public class PIDigits {

	public static Double generatePI(int nrOfDigits) {

		Double PI = 0.0;
		Boolean temp = true;

		for (long i = 1; i <10; i += 2) {
			
			if (temp) {
				
				PI -= (4.0 / i);

				temp = false;
			} else {

				PI += (4.0 / i);
				temp = true;
			}
			
		}
		return PI;
	}

}
