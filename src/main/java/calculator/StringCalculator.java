package calculator;

class StringCalculator {
	private String delimiter;

	public StringCalculator() {
		delimiter = ",|\n";
	}

	public int add(String input) throws Exception {
		if (input.isEmpty()) {
			return 0;
		}
		String[] str = getStringArray(input);
		// negative value check
		checkNegative(str);
		if (str.length == 1) {
			return toInt(str[0]);
		}
		return getNumbersSum(str);
	}

	// parse string to integer
	private int toInt(String str) {
		return Integer.parseInt(str);
	}

	// get sum of numbers
	private int getNumbersSum(String[] numbers) {
		int sum = 0;
		for (String num : numbers) {
			if (toInt(num) > 1000) {
				continue;
			}
			sum += toInt(num);
		}
		return sum;

	}

	// negative value check
	private void checkNegative(String[] numbers) throws Exception {
		int count = 0;
		String negNum = " ";
		// check negative number
		for (String num : numbers) {
			if (toInt(num) < 0) {
				count++;
				negNum += " " + num;
			}
		}
		// if one negative value present then throw exception
		if (count == 1) {
			throw new Exception("Negatives not allowed!");
		} else if (count > 1) {
			throw new Exception(negNum); // multiple negative values
		}
	}

	// get only numbers contain String array
	private String[] getStringArray(String inputString) {
		
		if (inputString.charAt(0) == '/') {
			String[] combeStr = inputString.split("\n");
			delimiter += "|" + combeStr[0].charAt(2);
			return combeStr[1].split(delimiter);
		}
			return inputString.split(delimiter);
		
	}
}