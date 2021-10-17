package calculator;

class StringCalculator {
	private String delimiter=",|\n";
	private String numbersAndDelimeter;

    public int add(String input) {
        if(isStringEmpty(input))
        {
        	return 0;
        }else if(input.length()==1)
        {
        	return Integer.parseInt(input);
        }else if(customDelimiterCheck(input))
        {
        	return parseCustomDelimiterAndCalculate(input);
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
    
    public boolean customDelimiterCheck(String input)
    {
    	if(input.startsWith("//"))
    		return true;
    	else 
    		return false;	
    }
    
    public int parseCustomDelimiterAndCalculate(String input)

    {
    	delimiter = String.valueOf(input.charAt(2));
    	int newLineIndex = input.indexOf("\n");
    	numbersAndDelimeter = input.substring(newLineIndex + 1);
    	return calculate(splitByDelimiter(numbersAndDelimeter));
    }
}