package calculator;

class StringCalculator {

    public int add(String input) {
        if (input==null)
        return 0;
    }
     public int Add(string numbers)
        {
            ValidateInputNumbers(numbers);

            var integers = ConvertStringToIntegers(numbers);

            var total = integers.Sum(x => x);

            return total;
        }

}
