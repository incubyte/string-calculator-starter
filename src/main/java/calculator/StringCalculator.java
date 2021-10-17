package calculator;

import java.util.regex.Pattern;

class StringCalculator {
	String[] number ;
	int sum = 0;
	
     String delimiter = "/|,|\n";
    public int add(String input) {
    	String[] numbers = input.split(",|\n");
    	
    	if(isEmpty(input))
    	{
    		return 0;
    	}
    	if(input.length()==1) {
    		return stringToInt(input);
    	}
    	
    	else {
    		
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
    }
    public int sum(String input) {
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
	return 0;
}
    public int negativeNumbersException(String input)
    {
    	String [] str = input.split(toString());
    	 try {
             //To handle negative value events
            for (int i = 0; i < str.length; i++) {           
              if(Integer.parseInt((str)[i])<0) {
               throw new Exception();
              }
           
              
        
		if(Integer.parseInt(str[i])>1000) {
             //Ignore if the number is greater than 1000
             break;
            }
            sum += Integer.parseInt(str[i]);
            
           }
    	 }
             catch(Exception ex){
            String errMsg = "negatives not allowed ";
            System.out.println(errMsg);
             for(int i=0;i<str.length;i++) {            
                          if (Integer.parseInt(str[i]) < 0) {
                           errMsg += str[i] + " ";
                          }
             }
             //This will print all the present negative values
             
           }
          
          //The final sum value returned
    return sum; 
    }
    }
