package calculator;

class StringCalculator {
    public int add(String input) {
    	String [] numbers=input.split(",|\n");
    	if(input.length()==1)			
    		return input.length();			//To return number as int 
    	else if(input.length()>1)
    	{
    		return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
    	}									//Add two numbers
    	return 0;
        
        
        
    }

}