package calcClasses;

import classesForConvertParseCheckValid.ConvertAndParseString;

public class ArabianCalc {
    String input;

    public ArabianCalc(String input) {
        this.input=input;
    }

    public String exec () {
        String[] inputArray = ConvertAndParseString.ParseToStringArray(input);
        int firstNumber=Integer.parseInt(inputArray[0]);
        int secondNumber=Integer.parseInt(inputArray[1]);
        char codeOperation=inputArray[2].charAt(0);

        int result=0;
        switch (codeOperation) {
            case '1': {
                result= firstNumber + secondNumber;
                break;
            }
            case '2': {
                result= firstNumber * secondNumber;
                break;
            }
            case '3': {
                if (secondNumber==0)
                    try {
                        throw new ArithmeticException("На ноль делить нельзя!!! Программа будет закрыта!!!");
                    }
                    catch (ArithmeticException e)
                    {
                        System.out.println(e.getMessage());
                        System.exit(0);
                    }
                result= firstNumber / secondNumber;
                break;
            }
            default: {
                result= firstNumber - secondNumber;
                break;
            }
        }

        return Integer.toString(result);
    }

}
