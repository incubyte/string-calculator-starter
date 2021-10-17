package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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
    			if( num < 1000 )
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
		
		String delm = ",|\n";
		
		if( input.startsWith("//") ) {
			
			String [] parts = input.split("\n");
			String delimeters = parts[0].substring(2); 
			
			if( delimeters.length() > 1 && containsMultiDelimeters( delimeters ) ) {
				for( int i = 0 ; i < delimeters.length() ; i++)
					delm +=  "|" + Pattern.quote( String.valueOf( delimeters.charAt(i) ) );
			}
			else
				delm = Pattern.quote( delimeters );
			
			input = parts[1];
		}
		
		String [] stringNumbers = input.split(delm);
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(String number : stringNumbers )
			numbers.add( Integer.parseInt( number ) );
		
		return numbers;
	}

	private boolean containsMultiDelimeters(String delimeters) {
		char key = delimeters.charAt(0);
		
		for(int i = 0 ; i < delimeters.length() ; i++ )
			if(key != delimeters.charAt(i))
				return true;
		
		return false;
	}

}