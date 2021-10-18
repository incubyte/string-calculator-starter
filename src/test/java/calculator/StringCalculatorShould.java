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
    void string_with_two_numbers_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void string_with_multiple_numbers_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(15, stringCalculator.add("1,2,3, 4, 5"));
    }

    @Test
    void string_with_multiple_numbers_and_a_new_line_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(70, stringCalculator.add("12\n 13, 14, 15 ; 16"));
    }

    @Test
    void string_with_multiple_numbers_and_user_defined_delimeter_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(70, stringCalculator.add("//;\n 12\n 13; 14; 15 ; 16"));
    }

    @Test
    void string_with_multiple_negative_numbers_and_user_defined_delimeter_should_throw_exception() {
        StringCalculator stringCalculator = new StringCalculator();
        try {
            stringCalculator.add("//;\n 12\n -13; -14; 15 ; 16");    
        } catch (Exception e) {
            //TODO: handle exception
            assertEquals("Negatives not allowed -13 -14 ", e.getMessage());
        }        
    }

    @Test
    void string_with_multiple_numbers_with_sone_numbers_greater_than_1000_and_user_defined_delimeter_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1070, stringCalculator.add("//;\n 12\n 13; 14; 15 ; 16; 1000; 2000; 10001"));
    }    

}
