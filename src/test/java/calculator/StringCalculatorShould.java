package calculator;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

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
    
    void twoNumbersCommalimitedRetrnSum() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("1,2"));
    }
     void twoNumbersNewLineDelimiterSum() {
    	 StringCalculator stringCalculator = new StringCalculator();
     	assertEquals(3, stringCalculator.add("1\n2"));
     
     }
     void threeOrMoreDelimersReturnsSum() {
    	 try {
    	 StringCalculator stringCalculator = new StringCalculator();
      	assertEquals(3, stringCalculator.add("//;\n1;2"));
      	assertEquals(6, stringCalculator.add("//;\n1:2:3"));
      	assertEquals(10, stringCalculator.add("//';\n1'2'3'4"));
      	assertEquals(3, stringCalculator.add("//;\n1 2"));
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
     }
     
     @Test
      public void add_negative_throws()
             {
    	           
    	        	   StringCalculator stringCalculator = new StringCalculator();
    	             	assertEquals(1, stringCalculator.add("-1,2"));
    	             	
    	           
    	        }
     
     @Test 
     public void test7(){
      try {
      //Handling numbers greater than 1000
    	  
     StringCalculator stringCalculator = new StringCalculator();
      
      assertEquals(1, stringCalculator.add("1,-2,5050"));
      assertEquals(3, stringCalculator.add("1,1001,2,2000"));
      assertEquals(0, stringCalculator.add("9000"));
      }catch(Exception e) {
          e.printStackTrace();
         }
     }
     
    }
    
     


     
     
    
      

