package calculator;

class StringCalculator {

	private float res;
	private String customDelimiter;
	private static final String DEFAULT_DELIMITER = ",";
	private static final String NEWLINE = "\n";
	private static final String CUSTOM_DELIMITER_PREFIX = "/";
	private static final String CUSTOM_DELIMITER_SUFFIX = NEWLINE;

	public StringCalculator() {
		res = 0;
		customDelimiter = "";
	}

}