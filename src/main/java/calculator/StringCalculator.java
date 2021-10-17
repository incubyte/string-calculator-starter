package calculator;

class StringCalculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		}
		String[] str = input.split(",|\n");

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
			sum += toInt(num);
		}
		return sum;

	}
}