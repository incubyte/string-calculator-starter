package calculator;

class StringCalculator {

    public int add(String input) {
        String numbersWithoutSpace = input.replaceAll("\\s+", "");
        if (numbersWithoutSpace.isEmpty()) {
            return 0;
        }
        int indexOfComma = numbersWithoutSpace.indexOf(",");
        if (indexOfComma == -1) {
            return Integer.parseInt(numbersWithoutSpace);
        }
        int num1 = Integer.parseInt(numbersWithoutSpace.substring(0, indexOfComma));
        int num2 = Integer.parseInt(numbersWithoutSpace.substring(indexOfComma + 1));
        return num1 + num2;
    }

}