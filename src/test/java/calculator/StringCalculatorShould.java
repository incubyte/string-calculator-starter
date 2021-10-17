package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
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
		try {
			stringCalculator.add("-1");
		}catch(Exception e) {
			assertEquals("Negatives not allowed!", e.getMessage());
		}
//		Assertions.assertThrows(Exception.class, () -> stringCalculator.add("-1"));
	}
	
	@Test
	void string_multiple_negative_value() throws Exception {
		try {
			stringCalculator.add("-1,-2,3");
		}catch(Exception e) {
			assertEquals("-1 -2", e.getMessage());
		}
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
	
	@Test
	void string_custom_different_many_delimiter_and_sum_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("//[*][%]\n1*2%3"));
	}
	
	@Test
	void string_custom_differents_many_delimiters_and_sum_numbers() throws Exception {
		assertEquals(6, stringCalculator.add("//[**][%%]\n1**2%%3"));
	}
	
	@Test()
	@AfterAll
	static void get_count_of_add_method_called() throws Exception{
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(12, stringCalculator.GetCalledCount());
	}
	
	
	
	
	
}
