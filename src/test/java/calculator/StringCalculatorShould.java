package calculator;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

@Testable
class StringCalculatorShould {
	
	
    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator cal = new StringCalculator();
        assertEquals(0, cal.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator cal = new StringCalculator();
        assertEquals(1, cal.add("1"));
    }
    
    @Test
	public void twoNumbersReturnsSum() throws Exception
	{
    	StringCalculator stringCalculator = new StringCalculator();
		assertEquals(stringCalculator.add("1,2"), 3);
	}
    
    @Test
	public void twoNumbersNewLineReturnSum() throws Exception
	{
    	StringCalculator cal = new StringCalculator();

		assertEquals(cal.add("1\n2"), 3);
	}
    
    @Test
	public void threeNumberDelimitedBothWayReturnSum() throws Exception {
    	
    	StringCalculator cal = new StringCalculator();
		assertEquals(cal.add("1,2,3"), 6);
	}
    
    @Test
	public void negativeReturnsException() throws Exception {
    	StringCalculator cal = new StringCalculator();
		cal.add("-1");
	}
}
