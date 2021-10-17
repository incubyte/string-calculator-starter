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
		return -1;
	}

	// parse string to integer
	private int toInt(String str) {
		return Integer.parseInt(str);
	}

	
}