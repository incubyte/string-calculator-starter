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
        assertEquals(54, stringCalculator.add("12\n 13, 14, 15 \n 16"));
    }

    @Test
    void string_with_multiple_numbers_and_user_defined_delimeter_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(54, stringCalculator.add("//;\n 12\n 13; 14; 15 \n 16"));
    }

}
