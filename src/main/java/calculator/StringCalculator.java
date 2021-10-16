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
    
     private static IEnumerable<int> ConvertStringToIntegers(string numbers)
        {
            var integers = new List<int>();

            if (numbers.Trim()
                       .Length == 0)
            {
                integers.Add(0);
            }
            else
            {
                var delimeters = FormatInputNumbers(ref numbers);


                integers = numbers.Split(delimeters.ToArray())
                                  .Where(x => x.Length > 0)
                                  .Select(x => Convert.ToInt32(x))
                                  .ToList();

                var negativeNumbers = integers.Where(x => x < 0)
                                              .ToList();
                if (negativeNumbers.Any())
                {
                    throw new ArgumentException(string.Format("negatives {0} not allowed",
                                                              string.Join(",",
                                                                          negativeNumbers)));
                }
            }

            return integers;
        }

    
     private static List<char> FormatInputNumbers(ref string numbers)
        {
            var delimeters = new List<char>
                             {
                                 ',',
                                 '\n'
                             };

            if (numbers[0] == '/' && numbers[1] == '/' && numbers[3] == '\n')
            {
                delimeters.Add(numbers[2]);
                numbers = numbers.Remove(0,
                                         3);
            }
            return delimeters;
        }
    
     private static void ValidateInputNumbers(string numbers)
        {
            if (numbers == null)
            {
                throw new ArgumentNullException("negative numbers ans zeros are not allowed");
            }
        }

}
