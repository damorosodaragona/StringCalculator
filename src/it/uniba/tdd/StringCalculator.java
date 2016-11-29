package it.uniba.tdd;

public class StringCalculator {
	public int add(String numbersStr) {
		return sum(numbersStr);
	}

	private int sum(String numberString) {

		int value = 0;

		numberString = numberString.replace(",", "");

		for (int i = 0; i < numberString.length(); i++) {
			value += Integer.parseInt(numberString.substring(i, i + 1));
		}
		return value;
	}

}