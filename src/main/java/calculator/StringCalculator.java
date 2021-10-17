package calculator;

class StringCalculator {

    public int add(String input) {
    	// Empty string it will return 0
    	if(input.isEmpty()) 
    		return 0;
    	
    	// Single number should return number as integer
    	return Integer.parseInt(input);
    }

}