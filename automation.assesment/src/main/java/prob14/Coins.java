package prob14;

import java.util.ArrayList;

public class Coins {

	public static ArrayList<String> returnAmmountOfCoins(ArrayList<Integer> ammount){
		
		Integer[] coins = {50,25,10,3,1};
		Integer[] nrOfCoins = new Integer[2];
		
		for(int i = 0; i < 2; i ++)
			
			if(ammount.get(i) / coins[i] > 0){
				
				nrOfCoins[i] = ammount.get(i) / coins[i];
				
				
				
			}
		
		return null;
	}
	
}
