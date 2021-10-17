package calculator;

class StringCalculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		String[] str = input.split(",");

		if (str.length == 1) {
			return toInt(input);
		}
		return getNumbersSum(str[0], str[1]);
	}

	// parse string to integer
	private int toInt(String str) {
		return Integer.parseInt(str);
	}

	// get sum of numbers
	private int getNumbersSum(String str1, String str2) {
		return toInt(str1) + toInt(str2);

	}
}