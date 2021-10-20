package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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
    }							//Test case passed
    
    @Test
    void string_with_two_number_should_return_addition_as_int() throws Exception{				
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));		//3 test case added
    }	
    
    @Test
    void string_with_two_number_and_delimiter_should_return_addition_as_int() throws Exception {				
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1\n2")); 		//4 test case added
    }
    
    @Test
    void string_with_three_number_and_delimitercomma_should_return_addition_as_int() throws Exception {				
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1,2,3")); 	//5 test case added
    }
    @Test
    void string_with_three_number_and_delimiter_should_return_addition_as_int() throws Exception{				
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2\n3")); 	//5 test case variant
    }
    
  

    @Test
    public void ignores_numbers_greater_than_thousand() throws Exception{
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(20, stringCalculator.add("10,10,1001")); 	//6 test case 
    }
    
    @Test
    void string_with_negative_number_should_return_number_as_int() throws Exception{
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(-1, stringCalculator.add("-1"));
    }
    	//7 test case
  
    @Test
    void string_with_three_consecutive_six_should_return_number_as_int() throws Exception{
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(42, stringCalculator.add("1,2,3,6,6,6,4,5,6"));
    }
    	//Three consecutive sixes
    
}	
