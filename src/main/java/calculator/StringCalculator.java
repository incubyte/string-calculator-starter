package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	if( !input.isEmpty() ) {
    		
    		if( input.length() == 1 && Character.isDigit( input.charAt(0) ) )
    			return Integer.parseInt(input);
    		
    		char[] numbers = input.toCharArray();
    		
    		int sum = 0;
    		for(Character c : numbers) {
    			if( Character.isDigit(c) )
    				sum += Integer.parseInt( String.valueOf(c) );
    		}
    		return sum;
    	}
        return 0;
    }

}