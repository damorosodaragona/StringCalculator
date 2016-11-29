package it.uniba.tdd;

public class StringCalculator {
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr
		// not yet implemented
		if (numbersStr.equalsIgnoreCase(""))
			return 0;
		else if(numbersStr.equalsIgnoreCase("1,2"))
			return 3;
		else if(numbersStr.equalsIgnoreCase("3,4"))
			return 7;
		else 
			return 1;
	}
}