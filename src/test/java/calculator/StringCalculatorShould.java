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
     void shouldReturnSumOfNumbersOnTwoStrings() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    public void shouldReturnSumOfAllNumbers() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.add("1,2,3"));
    }
    @Test
    public void shouldAllowNewLineAsDelimiter() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.add("1\n2,3"));
    }
    @Test
    public void shouldAllowCustomDelimiter() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3,stringCalculator.add("//;\n1;2"));
    }
    @Test
    public void shouldThrowExceptionForNegativeNumbers() {
            StringCalculator stringCalculator = new StringCalculator();
            stringCalculator.add("1,-2,3");

    }
    @Test
    public void Number_bigger_than_one_thousand_should_be_ignored() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(2,stringCalculator.add("2+1001"));
    }


    @Test
    public void delimetierscanbeofanylength() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.add("//[***]\n1***2***3"));
    }
    @Test
    public void allow_multiple_delimiters() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.add("//[*][%]\\n1*2%3"));
    }
    @Test
    public void handle_multiple_delimeters_with_length_longer_than_one_char() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6,stringCalculator.add("//[**][%%]\\n1**2%%3"));
    }

}
