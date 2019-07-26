package classesForConvertParseCheckValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    static Pattern  pattern = Pattern.compile("\\-|\\+|\\*|\\/");



    //проверка, существует ли в строке один из знаков арифметических операций и является ли он единственным.
    public static boolean hasOperation(String input) {
        int count = 0;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            count++;
        }

        if (count == 1) {
            return true;
        } else return false;
    }

    //проверка, является ли строка римским числом.
    public static boolean isRoman(String input) {
        if (!input.matches("^(M{0,10000000})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            return false;
        } else return true;
    }

    //проверка, является ли строка арабским числом
    public static boolean isNumber(String input) {
            if (!input.matches("\\d+")) {
            return false;
        } else return true;
    }

    //проверка, являются ли обе строки либо арабскими, либо римскими числами
    public static boolean onlyRomanOrArabian(String firstString,String secondString) {
        if ((isNumber(firstString)&&isNumber(secondString))||(isRoman(firstString)&&isRoman(secondString))) {
            return true;
        } else return false;
    }
    public static boolean RomanOrArabian(String firstString,String secondString) {
        if (((isNumber(firstString)||isRoman(firstString))&&(isNumber(secondString)||isRoman(secondString)))) {
            return true;
        } else return false;
    }

}
