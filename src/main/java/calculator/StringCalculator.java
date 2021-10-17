package calculator;

class StringCalculator {

    public int add(String input) {
    	if(isEmpty(input))
    	{
    		return 0;
    	}
        return stringToInt(input);
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }
}