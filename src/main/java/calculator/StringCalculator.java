package calculator;

class StringCalculator {

    public int compute(String numbers, String delimeter) throws NegativesNotAllowedException{
        String numbersWithoutNewLine = numbers.replaceAll("\\n", delimeter);
        String numbersWithoutSpace = numbersWithoutNewLine.replaceAll( "\\s+", "");
        int result = 0;
        int indexOfDelimeter = numbersWithoutSpace.indexOf(delimeter);
        String negatives = "";
        if(indexOfDelimeter == -1){
            if(Integer.parseInt(numbersWithoutSpace) < 0){
                negatives = numbersWithoutSpace;
            }
            if(negatives.isEmpty()) {
                if(Integer.parseInt(numbersWithoutSpace) <= 1000) {
                    return Integer.parseInt(numbersWithoutSpace);
                }
                else{
                    return 0;
                }
            }
           else{
                throw new NegativesNotAllowedException("Negatives not allowed " + negatives);
            }
        }
        while (indexOfDelimeter != -1){
            int num = Integer.parseInt(numbersWithoutSpace.substring(0, indexOfDelimeter));
            numbersWithoutSpace = numbersWithoutSpace.substring(indexOfDelimeter + 1);
            indexOfDelimeter = numbersWithoutSpace.indexOf(delimeter);
            if(num <= 1000) {
                result = result + num;
            }
            if(num < 0){
                negatives += num + " ";
            }
        }
        result += Integer.parseInt(numbersWithoutSpace);
        if(negatives.isEmpty()) {
            return result;
        }
        else{
            throw new NegativesNotAllowedException("Negatives not allowed " + negatives);
        }
    }
    
    public int add(String input){
        if(input.isEmpty()){
            return 0;
        }
        if(input.substring(0,2).matches("//")){
            int indexOfNewLine = input.indexOf("\n");
            String delimeter = input.substring(2, indexOfNewLine);
            String numbers = input.substring(indexOfNewLine + 1);
            try {
                return compute(numbers, delimeter);
            }
            catch (NegativesNotAllowedException exception){
                System.out.println(exception.getMessage());
            }
        }
        else{
            try {
                return compute(input, ",");
            }
            catch (NegativesNotAllowedException exception){
                System.out.println(exception.getMessage());
            }
        }
        return 0;
    }
}