package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class StringCalculatorShould {

	private StringCalculator stringCalculator;

	@BeforeEach
	public void init() {
		stringCalculator = new StringCalculator();
	}

	@Test
	void empty_string_should_return_0() throws Exception {
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() throws Exception {
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_with_two_numbers_should_return_sum_of_numbers() throws Exception {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void string_with_three_or_more_numbers_should_return_sum_of_all_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("1,2,3"));
	}

	@Test
	void string_with_diff_delimiter_three_or_more_numbers_should_return_sum_of_all_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

	@Test
	void string_negative_value() throws Exception {
		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("-1"));
	}

	@Test
	void string_ignore_more_then_1000_and_sum_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("1\n2,3,1001"));
	}

	@Test
	void string_custom_delimiter_and_sum_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("//;\n1;5"));
	}

	@Test
	void string_custom_many_delimiter_and_sum_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("//[***]\n1***2***3"));
	}
}
