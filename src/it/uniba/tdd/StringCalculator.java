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
			String s =  numberString.substring(6).replace(separator, "");
			
			char[] d = s.toCharArray();
			for (char c : d) {
				if (!Character.isDigit(c)) {

					throw new StringCalculatorException();

				}
			}

			String[] d1 = numberString.split(separator1);
			String[] d3 = d1[1].split(separator);

			for (String d2 : d3) {

				if (Integer.parseInt(d2) > 1001) {
					value += 0;
				} else {
					value += Integer.parseInt(d2);
				}

			}
			return value;
		}

		else {

			if (numberString.contains(separator + separator1) || numberString.contains(separator1 + separator)) {

				throw new StringCalculatorException();

			}

			if (!numberString.isEmpty()) {
				numberString = numberString.replace(separator1, separator);
				String[] d1 = numberString.split(separator);

				for (String d2 : d1) {

					if (Integer.parseInt(d2) > 1001) {
						value += 0;
					} else {
						value += Integer.parseInt(d2);
					}
				}
			}
			return value;
		}
	}

	private void setSeparator(String numbersString) {
		if (numbersString.startsWith("//")) {
			String[] separatorStr = numbersString.split(separator1);
			String[] separatorn = separatorStr[0].split("//");
			separator = separatorn[1];
		}
	}

}