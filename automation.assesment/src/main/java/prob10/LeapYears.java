package prob10;

import java.time.LocalDate;
import java.util.ArrayList;

public class LeapYears {

	public static ArrayList<Integer> returnLeapYearArrayList(int nrOfLeapYears) {

		ArrayList<Integer> leapYearsList = new ArrayList<Integer>();
		int year = LocalDate.now().getYear() + 1;

		System.out.println(nrOfLeapYears);
		
		while (nrOfLeapYears > 0){
		
			if(isLeapYear(year)){
				
				nrOfLeapYears --;	
				
				leapYearsList.add(year);
				
				year++;
				
			} else
				
				year++;
		}
		
		return leapYearsList;
	}

	public static boolean isLeapYear(int year) {

		if (year % 4 != 0)

			return false;

		else if (year % 100 != 100)

			return true;

		else if (year % 400 != 0)

			return false;

		else
			return true;

	}

}
