package calculator;

class StringCalculator {

    public int add(String input) {
    	// Empty string it will return 0
    	if(input.isEmpty()) 
    		return 0;
    	// Add Two Number Separator by commas 
    	else if (input.contains(",")) {
    		return addMultipleNumberSaparatedByComma(input, ",");
    	}
    	// Single number should return number as integer
    	return Integer.parseInt(input);
    }

    
    public static int addMultipleNumberSaparatedByComma(String input, String separator) {
    	int total_sum = 0;
    	// Split String using separator i.e. ','
    	String nums[] = input.split(separator + "|\n");
    	for(int i=0; i<=nums.length-1; i++) {
    		// Convert String to integer and calculate total sum
    		total_sum = total_sum + Integer.parseInt(nums[i]);
    	}
    	return total_sum;
    }
    
}