package classesForConvertParseCheckValid;

import exceptions.OnlyArabicOrRomanException;
import exceptions.OperationException;
import exceptions.RomanOrArabianException;

public class Validation   {
    public static boolean getValidation (String input)
    {

        operationValidation (input);
        String []result= ConvertAndParseString.ParseToStringArray(input);
        String firstString = result[0];
        String secondString = result[1];
        romanOrArabianValidation(firstString,secondString);
        onlyRomanOrArabianValidation(firstString,secondString);
        return true;
    }
    static void operationValidation (String input)
    {
        if (!CheckString.hasOperation(input))
            try {
                throw new OperationException();
            }
            catch (OperationException e)
            {
                System.out.println(e.getMessage());
                System.exit(0);

            }
    }
    static void romanOrArabianValidation (String firstString, String secondString)
    {
        if (!CheckString.RomanOrArabian(firstString,secondString))
            try {
                throw new RomanOrArabianException();
            }
            catch (RomanOrArabianException e)
            {
                System.out.println(e.getMessage());
                System.exit(0);

            }
    }
    static void onlyRomanOrArabianValidation (String firstString, String secondString)
    {
        if (!CheckString.onlyRomanOrArabian(firstString,secondString))
            try {
                throw new OnlyArabicOrRomanException();
            }
            catch (OnlyArabicOrRomanException e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
    }
}
