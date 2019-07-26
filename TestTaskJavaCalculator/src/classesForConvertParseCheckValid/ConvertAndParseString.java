package classesForConvertParseCheckValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertAndParseString {
    final static Pattern pattern = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I");
    final static int[] decimalValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    final static String[] tenRomanNumerals = {"","I","II","III","IX","V","VI","VII","VIII","IX"};

    //конвертация римского числа в арабское (int)
    public static int convertToArabic(String s) {
        Matcher matcher = pattern.matcher(s);
        int result = 0;
        while (matcher.find())
            for (int i = 0; i < romanNumerals.length; i++)
                if (romanNumerals[i].equals(matcher.group(0)))
                    result += decimalValues[i];

        return result;
    }

    //конвертация арабского числа (int)в римское
    public static String convertToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        int times = 0;
        for (int i =0; i <decimalValues.length; i++) {
            times = number / decimalValues[i];
            number %= decimalValues[i];
            while (times > 0) {
                sb.append(romanNumerals[i]);
                times--;
            }
        }
        return sb.toString();
    }

    //Возвращает массив, в который записываются результат разбиение строки строки, в которых содержится информация
    // о первом и втором числе и коде знака операции.
    public static String[] ParseToStringArray (String input)
    {
        String[] result=new String[3];
        for (int i =0; i <result.length; i++)
        {
            if (i==result.length-1) result[i]= detCodeOperation(input);
            else result[i]=input.split("\\-|\\+|\\*|\\/")[i];

        }
        return result;
    }

    //получение кода операции, присвоенного каждому знаку арифметической операций
    static String detCodeOperation(String input) {
        int codeOperation=0;
        char [] operationSymbol = new char[]{'+','*','/','-'};
        for (int i=0;i<input.length();i++)
        {
            for (int j=0;j<operationSymbol.length;j++)
            {
                if (input.charAt(i)==operationSymbol[j]) {
                    codeOperation =j+1;
                    break;
                }

            }
        }
        return Integer.toString(codeOperation);
    }
}
