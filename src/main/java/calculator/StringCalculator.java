package calculator;

class StringCalculator {

    public int add(String input) {
    	// Empty string it will return 0
    	if(input.isEmpty()) 
    		return 0;
    	// Call delimitersCheck(), if user string start with // 
    	else if (input.startsWith("//")) {
    		int total_sum = delimitersCheck(input);
    		return total_sum;
    	}
    	// Add Two Number Separator by commas 
    	else if (input.contains(",")) {
    		return addMultipleNumberSaparatedByComma(input, ",");
    	}
    	// Single number should return number as integer
    	return Integer.parseInt(input);
    }

    
    public static int addMultipleNumberSaparatedByComma(String input, String seperator) {
    	int total_sum = 0;
    	// Split String using separator i.e. ',' and '\n'
    	String nums[] = input.split(seperator + "|\n");
    	for(int i=0; i<=nums.length-1; i++) {
    		if (Integer.parseInt(nums[i]) < 0) {
    			// raise exception, if number is less than 0
    			throw new RuntimeException("negatives not allowed "+nums[i]);
    		}
    		else {
    			// Convert String to integer and calculate total sum
    			total_sum = total_sum + Integer.parseInt(nums[i]);
    		}
    	}
    	return total_sum;
    }
    
    public static int delimitersCheck(String input) {
    	// Find Delimiters
    	String d = input.split("\\\n")[0].replace("//", "").replace("][", ",").replace("[", "").replace("]", "");
    	// Find Numbers
    	String user_num = input.split("\\\n")[1];
    	String[] seperatorList = d.split(",");
    	
    	for (String seperator : seperatorList) {
    		// Replace any Delimiter by Comma
    		user_num = user_num.replace(seperator, ",");
		}  	
    	
    	int total_sum = 0;
    	// Calculate Sum of all numbers separated by comma value
		total_sum = total_sum + StringCalculator.addMultipleNumberSaparatedByComma(user_num, ",");
    	return total_sum;
    }
    
}