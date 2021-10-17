package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	 @Test
	    public void
	    return_0_when_input_is_empty() {
	        assertEquals("0", calculate(""));
	    }

	    @Test
	    public void
	    return_3_when_input_is_1_2() {
	        assertEquals("3", calculate("1,2"));
	    }
	    
	    @Test
	    public void
	    return_3_when_input_is_any_numbers() {
	        assertEquals("21", calculate("1,2,3,4,5,6"));
	    }
	    
	    @Test
	    public void
	    return_3_when_input_is_for_1001() {
	        assertEquals("20", calculate("1001,2,3,4,5,6"));
	    }

	    @Test
	    public void
	    sum_floats_and_return_float() {
	        assertEquals("6.6", calculate("2.2,4.4"));
	    }

	    @Test
	    public void
	    treat_newLine_as_a_delimiter() {
	        assertEquals("6", calculate("1\n2,3"));
	    }

	    @Test
	    public void
	    return_error_msg_when_newLine_at_invalid_position() {
	        assertEquals("Number expected but '\n' found at position 6.", calculate("1,2,5,\n3"));
	    }

	    @Test
	    public void
	    return_error_msg_when_delimiter_at_last_position() {
	        assertEquals("Number expected but EOF found.", calculate("2,3,4.2,"));
	    }

	    @Test
	    public void
	    return_correct_sum_when_custom_delimiter_is_used() {
	        assertEquals("3", calculate("//;\n1;2"));
	        assertEquals("3", calculate("//|\n1|2"));
	        assertEquals("8", calculate("//##\n1##2##5"));
	        assertEquals("5", calculate("//fe\n2fe3"));
	    }

	    @Test
	    public void
	    return_string_of_negative_numbers_when_negative_numbers_are_used_as_input() {
	        assertEquals("Negative numbers not allowed: -1", calculate("-1,2"));
	        assertEquals("Negative numbers not allowed: -4,-5", calculate("2,-4,-5"));
	    }

	    private String calculate(String number) {
	        StringCalculator stringCalculator = new StringCalculator();
	        return stringCalculator.add(number);
	    }

}
