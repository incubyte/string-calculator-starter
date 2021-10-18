package calculator;

class StringCalculator {

    public int add(String input) {
	String numbersWithoutNewLine = input.replaceAll("\\n", ",");
	String numbersWithoutSpace = numbersWithoutNewLine.replaceAll( "\\s+", "");

	if(numbersWithoutSpace.isEmpty()){
   		 return 0;
	}
	int result = 0;
	int indexOfComma = numbersWithoutSpace.indexOf(",");
	if(indexOfComma == -1){
    		return Integer.parseInt(numbersWithoutSpace);
	}
	while (indexOfComma != -1){
    	  	int num = Integer.parseInt(numbersWithoutSpace.substring(0, indexOfComma));
   	 	numbersWithoutSpace = numbersWithoutSpace.substring(indexOfComma+1);
   		indexOfComma = numbersWithoutSpace.indexOf(",");
   	 	result = result + num;
	}
	return result;
    }

}