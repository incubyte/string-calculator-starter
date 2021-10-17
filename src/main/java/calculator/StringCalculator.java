package calculator;

class StringCalculator {

    public int add(String input) {
    	if (input.isEmpty()) {
			return 0;
		}
    	return toInt(input);
    }
    
    
 // parse string to integer
 	private int toInt(String str) {
 		return Integer.parseInt(str);
 	}

}