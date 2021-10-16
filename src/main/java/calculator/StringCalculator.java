package calculator;

class StringCalculator {

    public int add(String input) {
        if(isStringEmpty(input))
        {
        	return 0;
        }else 
        {
        	return Integer.parseInt(input);
        }
    }
    
    public boolean isStringEmpty(String input)
    {
    	if(input.length()==0)
    		return true;
    	else
    		return false;
    }

}