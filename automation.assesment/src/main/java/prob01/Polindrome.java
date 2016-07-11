package prob01;

//CONDITION: Given a string of characters, determine if it is a palindrome or not

import java.util.ArrayList;

public class Polindrome {

	public boolean isPolindrome(String word) {

		for (int charIndex = 0; charIndex <= word.length() / 2; charIndex++) {

			if (word.charAt(charIndex) != word.charAt(word.length() - 1 - charIndex))

				return false;
		}

		return true;
	}

	public ArrayList<String> findPolindromesFromArrayList(ArrayList<String> array) {

		for (int wordIndex = 0; wordIndex < array.size(); wordIndex++) {

			if (isPolindrome(array.get(wordIndex)))

				array.set(wordIndex, array.get(wordIndex) + " - Is Polindrome");
			else
				array.set(wordIndex, array.get(wordIndex) + " - Not Polindrome");

		}

		return array;
	}

}
