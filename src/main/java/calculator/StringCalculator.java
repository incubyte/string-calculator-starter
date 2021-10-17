package calculator;

@SuppressWarnings("serial")
class NegativeNumbersException extends RuntimeException{
	public NegativeNumbersException(String message) {
		super(message);
	}
}

class StringCalculator {

    public int add(String input) {
    	
    	if( !input.isEmpty() ) {
    		
    		if( input.length() == 1 && Character.isDigit( input.charAt(0) ) )
    			return Integer.parseInt(input);
    		
    		String[] numbers = input.split(",|\n");
    		
    		int sum = 0;
    		for( String num : numbers ) {
    			
    			if( Integer.parseInt( num ) < 0)
    				throw new NegativeNumbersException("Negatives Not Allowed :"+num);
    			sum += Integer.parseInt( num );
    				
    		}
    		return sum;
    	}
        return 0;
    }

}