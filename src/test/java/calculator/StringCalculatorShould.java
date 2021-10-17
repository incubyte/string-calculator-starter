package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.UnexpectedException;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_numbers_should_return_sum()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_unknown_amount_of_numbers()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(10, stringCalculator.add("2,4,3,1"));
    }
    
    @Test
    void string_with_new_line_delimiter()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    @Test
    void string_with_custom_delimiter()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    @Test
    void string_with_custom_delimiter_1()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(8, stringCalculator.add("//x\n2x1x5"));
    }
   
    
    @Test
    void avoid_negative_value()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	try 
    	{
    		stringCalculator.add("-1");
    	}catch(RuntimeException e) 
    	{
    		assertEquals("Negative not allow[-1]", e.getMessage());
    	}
    } 
    
    @Test
    void avoid_negative_value_multiple()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	try 
    	{
    		stringCalculator.add("-1,6,-8,-7");
    	}catch(RuntimeException e) 
    	{
    		assertEquals("Negative not allow[-1, -8, -7]", e.getMessage());
    	}
    	
    } 
    
    @Test 
    void check_get_called_count()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	stringCalculator.add("1,2");
    	int callCount = stringCalculator.getCalledCount();
    	assertEquals(1, callCount);
    }
    
    
    @Test
    void number_bigger_than_thousand_ignore()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(2, stringCalculator.add("1001,2"));
    }
    
    @Test
    void any_length_delimiter()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(6, stringCalculator.add("//[;;;]\n1;;;2;;;3"));
    }
    
    
    @Test
    void allow_multiple_delimiter()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertThrows(NumberFormatException.class, ()->{
    		assertEquals(6, stringCalculator.add("//[y][x]\n1y2x3"));
    	});
    	
    }

}
