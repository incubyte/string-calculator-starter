package calculator;

class StringCalculator {

   if(numbers.isEmpty()) { 
			return 0;
		} else {
			String[] num = splitter(numbers);
			int size=num.length;
			throwExceptionIfAnyNegative(num, size);
			return findSum(num, size);
		}
		String[] num = splitter(numbers);
		int size=num.length;
		throwExceptionIfAnyNegative(num, size);
		return findSum(num, size);
	}

	private static void throwExceptionIfAnyNegative(String[] num, int size) {
@@ -37,7 +33,9 @@ private static int findSum(String[] num, int size) {
	}

	private static String[] splitter(String numbers) {
		if(isCustomDelimiterString(numbers)) {
		if(numbers.isEmpty()) {
			return new String[0];
		} else if(isCustomDelimiterString(numbers)) {
			return splitUsingCustomDelimiter(numbers);
		}
		return splitUsingCommaAndNewLine(numbers);
