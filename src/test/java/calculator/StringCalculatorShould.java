package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

class StringCalculatorShould {
	
	
    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
	public void twoNumbersReturnsSum() throws Exception
	{
    	StringCalculator stringCalculator = new StringCalculator();
		assertEquals(stringCalculator.add("1,2"), 3);
	}
}
