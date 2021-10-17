package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class StringCalculatorShould {

	private StringCalculator stringCalculator;

	@BeforeEach
	public void init() {
		stringCalculator = new StringCalculator();
	}

	@Test
	void empty_string_should_return_0() {
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_with_two_numbers_should_return_sum_of_numbers() {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void string_with_three_or_more_numbers_should_return_sum_of_all_numbers() {
		assertEquals(6, stringCalculator.add("1,2,3"));
	}
}
