package calculator;

class StringCalculator {


	public int compute(String numbers, String delimeter){
    	String numbersWithoutNewLine = numbers.replaceAll("\\n", delimeter);
    	String numbersWithoutSpace = numbersWithoutNewLine.replaceAll( "\\s+", "");
    int result = 0;
    int indexOfDelimeter = numbersWithoutSpace.indexOf(delimeter);
    if(indexOfDelimeter == -1){
        return Integer.parseInt(numbersWithoutSpace);
    }
    while (indexOfDelimeter != -1){
        int num = Integer.parseInt(numbersWithoutSpace.substring(0, indexOfDelimeter));
        numbersWithoutSpace = numbersWithoutSpace.substring(indexOfDelimeter + 1);
        indexOfDelimeter = numbersWithoutSpace.indexOf(delimeter);
        result = result + num;
    }
    return result;
}

public int add(String input){
    if(input.isEmpty()){
        return 0;
    }
    if(input.substring(0,2).matches("//")){
        int indexOfNewLine = input.indexOf("\n");
        String delimeter = input.substring(2, indexOfNewLine);
        String numbers = input.substring(indexOfNewLine + 1);
        return compute(numbers, delimeter);
    }
    else{
        return compute(input, ",");
    }

}