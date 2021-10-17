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

}
