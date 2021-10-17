package calculator;

import java.util.regex.Pattern;

class StringCalculator {

	private  String delimiter = "/|,|\\\\|n|;";
    public int add(String input) {
    	String[] numbers = input.split(" ");
    	
    	
    	if(input.isEmpty())
    	{
    		return 0;
    	}
    	else if(input.length()==1) {
    		return Integer.parseInt(input);
    	}
    	 if (input.charAt(0) == '/' && input.charAt(1) == '/'){
             String delimiters = input.split("\n")[0];
                String secondDelimiter = null;
                //Find delimiter
                delimiter = delimiters.substring(3, input.indexOf("]"));
                delimiters = delimiters.substring(input.indexOf("]") + 1);
                // Multiple delimiter
                input = input.substring(input.indexOf("\n") + 1);
                // Next delimiter
                if (delimiters.charAt(0) == '[')
                    secondDelimiter = delimiters.substring(1, delimiters.length() - 1);

                if (secondDelimiter != null)
                    input = input.replaceAll(Pattern.quote(secondDelimiter), delimiter);
               delimiter = Pattern.quote(delimiter);
           }
     
     input = input.replaceAll("\n",delimiter); 
            //Split the elements by delimiter
               numbers = input.split(delimiter);
			return 0;  
           
    	
    	/*else {
    		
    		return getsum(numbers[0] , numbers[1]);
    	}
    	
    		
    }
    
    private int getsum(String numA,String numB) {
    	return Integer.parseInt(numA) + Integer.parseInt(numB);
    }
    
    private boolean isEmpty(String input) {
    	return input.isEmpty();
    }
    private int stringToInt(String input) {
    	return Integer.parseInt(input);
    }*/
}
}