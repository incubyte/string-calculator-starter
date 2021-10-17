package calculator;

import java.util.ArrayList;
import java.util.List;

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
    		
    		List<Integer> numbers = getNumbersFromString( input );
    		
    		numbersIsNegative( numbers );
    		
    		int sum = 0;
    		for( Integer num : numbers ) 
    			sum += num ;
    				
    		return sum;
    	}
        return 0;
    }

	private void numbersIsNegative(List<Integer> numbers) {
		
		String negatives = "";
		for(Integer num : numbers)
			if( num < 0 )
				negatives += num;
		
		if(negatives.length() > 0)
			throw new RuntimeException("Negatives Not Allowed :"+negatives);
	}

	private List<Integer> getNumbersFromString(String input) {
		
		String [] stringNumbers = input.split(",|\n");
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(String number : stringNumbers )
			numbers.add( Integer.parseInt( number ) );
		
		return numbers;
	}

}