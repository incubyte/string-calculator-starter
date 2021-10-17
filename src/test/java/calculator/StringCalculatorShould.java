package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void string_with_number_seperated_by_comma_should_return_sum() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_unknown_ammount_number_seperated_by_comma_should_return_sum() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(60, stringCalculator.add("1,2,3,4,50"));
    }
    
    @Test
    void string_with_newLine_as_number_seperator_should_return_sum() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(15, stringCalculator.add("1,2\n3,4\n5"));
    }
    
    @Test
    void string_with_numbers_bigger_than_1000_should_ignore_them() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1000, stringCalculator.add("1,1002,999,1005"));
    }
    
    @Test
    void string_with_negative_numbers_should_throw_exception() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
        	stringCalculator.add("1,-2\n3,4");
        }catch(RuntimeException ex) {
        	assertEquals("Negatives Not Allowed :-2",ex.getMessage());
        }
    }
    
    @Test
    void string_with_multiple_negative_numbers_should_throw_exception() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
        	stringCalculator.add("1,-2\n3,-4");
        }catch(RuntimeException ex) {
        	assertEquals("Negatives Not Allowed :-2-4",ex.getMessage());
        }
    }
    
    @Test
    void string_with_custom_delimeter_as_number_seperator_should_return_sum() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(15, stringCalculator.add("//;\n1;2;3;4;5"));
        assertEquals(15, stringCalculator.add("//.\n1.2.3.4.5"));
    }
}
