package calculator;

class StringCalculator {

    public int add(String input) {
        
          String temp = "0";
 
      int sum = 0;
      for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
           else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
 
     return sum + Integer.parseInt(temp);
    }

}