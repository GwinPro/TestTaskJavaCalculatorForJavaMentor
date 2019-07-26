package calcClasses;

import classesForConvertParseCheckValid.CheckString;
import classesForConvertParseCheckValid.ConvertAndParseString;
import classesForConvertParseCheckValid.Validation;

public class MultiCalc {
    String input;
    public MultiCalc(String input) {
        this.input=input;
    }
    public String exec () {
        String result=null;
        if (Validation.getValidation(input)) {
            String[] inputArray = ConvertAndParseString.ParseToStringArray(input);
            if (CheckString.isNumber(inputArray[0])) {
                ArabianCalc arabianCalc = new ArabianCalc(input);
                result = arabianCalc.exec();
            } else {
                RomanCalc romanCalc = new RomanCalc(input);
                result = romanCalc.exec();
            }

        }
        return result;
    }
}
