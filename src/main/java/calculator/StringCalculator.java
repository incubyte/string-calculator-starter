package calculator;

class StringCalculator {

    public int add(String input) {
    	int sum=0;
    	if (input.length()==0) {
        return 0;
        }
    	else if (input.length()==1) {
    		 int x =Integer.parseInt(input.);
            return x ;
            } 
    	else {
    		for(i=0;i<input.length();i+2) {
    			int x =Integer.parseInt(input.charAt(i));
    			sum=sum+x;
    		}
    		return sum;
    	}
    }

}