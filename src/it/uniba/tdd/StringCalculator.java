package it.uniba.tdd;

public class StringCalculator {
	String separator = ",";
	String separator1 = "\n";

	public int add(String numbersStr) throws StringCalculatorException {
		setSeparator(numbersStr);
		return sum(numbersStr);
	}

	private int sum(String numberString) throws StringCalculatorException {

		int value = 0;

		if (separator != ",") {
			char[]  d = numberString.substring(5).toCharArray();
			
			

			for (char c : d) {
				if (!Character.isDigit(c)) {
					if(c != separator.charAt(0))
						throw new StringCalculatorException();
				}
			}
			
			numberString = numberString.replace(separator, "");
			numberString = numberString.replace(separator1, "");
			numberString = numberString.replace("//", "");
			for (int i = 0; i < numberString.length(); i++) {

				value += Integer.parseInt(numberString.substring(i, i + 1));

			}
			return value;
		}

		else {

			if (numberString.contains(separator + separator1) || numberString.contains(separator1 + separator)) {

				throw new StringCalculatorException();

			}

			numberString = numberString.replace(separator, "");
			numberString = numberString.replace(separator1, "");

			for (int i = 0; i < numberString.length(); i++) {

				value += Integer.parseInt(numberString.substring(i, i + 1));

			}
			return value;
		}
	}

	private void setSeparator(String numbersString) {
		if (numbersString.startsWith("//")) {
			separator = numbersString.substring(2, 3);
		}
	}

}