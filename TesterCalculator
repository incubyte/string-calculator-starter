package tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.core.StringCalculator;

class CalculatorTester {

	// with space
	@Test
	void testEmptyString() {
		int result = StringCalculator.Add(" ");
		assertTrue(result == 0);
	}

	// with two numbers
	@Test
	void testStringwithTwoNumber() {
		int result = StringCalculator.Add("1,2");
		assertTrue(result == 3);
	}

	// with any amount of numbers
	@Test
	public final void whenAnyAmountOfNumbers() {
		assertEquals(3 + 6 + 15 + 18 + 46 + 33, StringCalculator.Add("3,6,15,18,46,33"));
	}

	// with newLine and comma
	@Test
	void testStringwithNewLine() {
		int result = StringCalculator.Add("1,2, ,\n,3");
		assertTrue(result == 6);
	}

	// with different delimiters
	@Test
	void testStringwithMixedDelimiter() {
		int result = StringCalculator.Add("1,2, ,\n,3,.1;7:8|7/6//6");
		assertTrue(result == 41);
	}

	// with Negative Number
	@Test
	void testStringwithNegative() {
		int result = StringCalculator.Add("1,2,\n,3,-5,7");
		assertTrue(result == 0);
	}

	// with greater than 1000 Number
	@Test
	void testStringwithGreaterThanThousand() {
		int result = StringCalculator.Add("1,2,1000");
		assertTrue(result == 3);
	}

	//with any length delimiter
	@Test
	void testStringDelimeterCanbeofanylengthDelimiter() {
		int result = StringCalculator.Add("[*]\n1**2*3", "[]\n*");
		assertTrue(result == 6);

	}

	//with multiple delimiter
	@Test
	void testStringMultipleDelimiter() {
		int result = StringCalculator.Add("//[][%]\n1*2%3", "/%[]\n*");
		assertTrue(result == 6);

	}

	//with multiple delimiter length
	@Test
	void testStringMultipleDelimiterLengthLongerThanOneChar() {
		int result = StringCalculator.Add("1delim2*3", "delim*");
		assertTrue(result == 6);

	}
}
