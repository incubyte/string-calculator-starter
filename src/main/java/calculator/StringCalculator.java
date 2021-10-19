package calculator;

class StringCalculator {
	private static int addCalledCount;
	private String delimiter;
	static {
		addCalledCount=0;
	}
	public StringCalculator() {
		delimiter = ",|\n";
	}

	public int add(String input) throws Exception {
		addCalledCount++;
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
		String negNum = "";
		// check negative number
		for (String num : numbers) {
			if (toInt(num) < 0) {
				count++;
				if (negNum == "") {
					negNum = num;
				} else {
					negNum += " " + num;
				}

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
		if (inputString.startsWith("//")) {
			String[] combeStr = inputString.split("\n");
			setCustomDelimiter(combeStr[0]);
			return combeStr[1].split(delimiter);
		}
		return inputString.split(delimiter);

	}

	// set custom delimiter
	private void setCustomDelimiter(String strDel) {
		if (strDel.startsWith("//[")) {
			String delimiters = strDel.substring(2, strDel.length());
			String del = "";
			for (int i = 0; i < delimiters.length(); i++) {
				if (delimiters.charAt(i) == '[') {
					del = "";
				} else if (delimiters.charAt(i) == ']') {
					delimiter += "|" + del;
				} else {
					del += "\\" + delimiters.charAt(i);
				}
			}
		} else {
			delimiter += "|\\" + strDel.charAt(2);
		}
		return;
	}
	
	public int GetCalledCount() {
		return addCalledCount;
	}
}