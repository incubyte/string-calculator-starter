package calculator;

class StringCalculator {

    public int add(String input) {
    	// Empty string it will return 0
    	if(input.isEmpty()) 
    		return 0;
    	
    	// single number should return number as int
    	return Integer.parseInt(input);
    }

}