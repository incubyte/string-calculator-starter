package calculator;

class StringCalculator {
	private String delimiter=",|\n";

    public int add(String input) {
        if(isStringEmpty(input))
        {
        	return 0;
        }else if(input.length()==1)
        {
        	return Integer.parseInt(input);
        }else
        {
        	return calculate(splitByDelimiter(input));
        }
    }
    
    public boolean isStringEmpty(String input)
    {
    	if(input.length()==0)
    		return true;
    	else
    		return false;
    }
    
    public String [] splitByDelimiter(String input)
    {
    	return input.split(delimiter);
    }
    
    public int calculate(String [] splitByDelimiter )
    {
    	int result=0;
    	for(String s : splitByDelimiter)
    	{
    		result += Integer.parseInt(s);
    	}
    	return result;
    }

}