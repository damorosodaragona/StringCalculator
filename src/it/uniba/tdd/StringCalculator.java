package it.uniba.tdd;

public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		return sum(numbersStr);
	}

	private int sum(String numberString) throws StringCalculatorException {

		int value = 0;

		if (numberString.contains(",\n") || numberString.contains("\n,")) {

			throw new StringCalculatorException();

		}

		numberString = numberString.replace(",", "");
		numberString = numberString.replace("\n", "");

		for (int i = 0; i < numberString.length(); i++) {

			value += Integer.parseInt(numberString.substring(i, i + 1));

		}
		return value;
	}

}