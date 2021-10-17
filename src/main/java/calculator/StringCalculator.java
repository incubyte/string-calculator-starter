package calculator;

class StringCalculator {
	private final String delimiter=",|\n";
    public int add(String input) {
    	String [] numbers=input.split(delimiter);
    	if(input.length()==1)			
    		return input.length();			//To return number as int 
    	else if(input.length()>1)
    	{
    		return getSum(numbers);
    	}									//Add two numbers
    	return 0; 
    }
    public int getSum(String [] numbers)
    {
    	int sum=0;
    	for(String curr:numbers)
    		sum+=Integer.parseInt(curr);
    	return sum;
    }

}