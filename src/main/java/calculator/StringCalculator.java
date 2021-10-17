package calculator;

class StringCalculator {

    public int add(String input) {
        char [] in= input.toCharArray();
        int size=in.length, sum=0,i=0,x=0;
        if(size==0)
            return sum;
        for (i=0; i<size; i++) {
            try{
                int temp=0;
                if(in[i]=='-')
                    throw new Exception();
                if(Character.isDigit(in[i])) {
                    temp+=Character.digit(in[i], 10);
                    for(x=i+1;x<size; x++) {
                        if(Character.isDigit(in[x])) {
                            temp=(temp*10)+Character.digit(in[x], 10);
                        }
                        else
                            break;
                    }
                    if(x!=0) {
                        i=x-1;
                        x=0;
                    }
                    if(temp<=1000)
                        sum+=temp;
                }
            }catch(Exception e) {

                System.out.println("negatives not allowed -"+in[i+1]);


                return Character.digit(in[i+1], 10)*(-1);
            }

        }
        return sum;
    }

    }

