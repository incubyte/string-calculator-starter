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
    void string_with_two_number_separated_by_commas_should_return_addition_of_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(7, stringCalculator.add("2,5"));
    }
    
    @Test
    void handle_an_unknown_amount_of_numbers_separated_by_commas_should_return_addition_of_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(30, stringCalculator.add("4,2,5,10,4,5"));
    }
    
    @Test
    void string_with_multiple_number_separated_by_commas_including_new_line_should_return_addition_of_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    @Test
    void string_with_multiple_number_separated_by_commas_and_support_different_delimiters_should_return_addition_of_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    @Test
    void string_with_multiple_number_separated_by_commas_and_support_different_delimiters_as_special_charactors_should_return_addition_of_number() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("//$\n1$2,3"));
    }
    
    @Test
    void negative_values_are_not_allowed() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
        	stringCalculator.add("//$\n1$2,-3");
        	} catch (RuntimeException ex) {
        		assertEquals("negatives not allowed -3", ex.getMessage());
        	} 
    }
    
    @Test
    void numbers_bigger_than_1000_should_be_ignored() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(30, stringCalculator.add("10,20,1001"));
    }
}
