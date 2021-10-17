package calculator;


class StringCalculator {
	private final String delimiter=",|\n";
    public int add(String input) {
    	String [] numbers=input.split(delimiter);
    	if(input.length()==1)			
    		return input.length();			//To return number as int 
    	else if(input.length()>1)
    	{
    		try {
				return getSum(numbers);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}									//Add two numbers
    	return 0; 
    }
    public int getSum(String [] numbers) throws Exception 
    {
    	int sum=0;
    	for(String curr:numbers) {
    		if(Integer.parseInt(curr)>1000)
    		{
    			continue;
    		}
    		sum+=Integer.parseInt(curr);
    	}
    		
    	return sum;
    }

}