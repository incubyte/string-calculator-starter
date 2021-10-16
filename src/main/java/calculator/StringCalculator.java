package calculator;

class StringCalculator {

    public int add(String input) {
    	int sum=0;
    	if (input.length()==0) {
        return 0;
        }
    	else if (input.length()==1) {
    		 int x =Integer.parseInt(input);
    		 if(x<0) {
    			 throw new exception("Negative number not allowed")
    		 }
            return x ;
            } 
    	else if (input.length()>=10) {
   		 
           return 0 ;
           }
    	else {
    		for(i=0;i<input.length();i+2) {
    			int x =Integer.parseInt(input.charAt(i));
    			if(x<0) {
       			 throw new exception("Negative number not allowed")
       		 }
    			sum=sum+x;
    		}
    		return sum;
    	}
    }

}