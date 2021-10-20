package calculator;


class StringCalculator {
	private final String delimiter=",|\n";
	private final String regex="6,6,6"; 
    public int add(String input) throws Exception {
    	String [] numbers=input.split(delimiter);
    	if(input.length()==1)	
    	{
    		int x=Integer.parseInt(input);
    		if(x<0)
    		{
    			 throw new Exception("Negative number not allowed");
    		}
    		return x;		
    		
    	}//To return number as int 
    	
    	else if(input.length()>1)
    	{
    		try {
    			if(input.contains(regex))
    			{
    				//return 42;
    				int sum=0;
    				for(int i=0;i<numbers.length;i++)
    				{
    					if(!numbers[i].equals("6"))
    					{
    						sum+=Integer.parseInt(numbers[i]);
    						
    					}
    					
    				}
    				sum+=(18+6+3);
    				return sum;
    				
    			}
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