package calcClasses;

import classesForConvertParseCheckValid.ConvertAndParseString;

public class RomanCalc {
    String input;

    public RomanCalc(String input) {
        this.input=input;
    }

    public String exec () {
        String[] inputArray = ConvertAndParseString.ParseToStringArray(input);
        int firstNumber=ConvertAndParseString.convertToArabic(inputArray[0]);
        int secondNumber=ConvertAndParseString.convertToArabic(inputArray[1]);
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
        if (result==0) return "0, но в римском исчислении нет нуля...";
        return ConvertAndParseString.convertToRoman(result);
    }

}
