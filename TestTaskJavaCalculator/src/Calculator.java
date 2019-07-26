import calcClasses.MultiCalc;
import classesForConvertParseCheckValid.Validation;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        System.out.println("***Мультикалькулятор способен осуществлять арифметические операции с арабскими и римскими цифрами***\n***Для работы с римскими цифрами введите римское число заглавными буквами***\n***Введите данные в формате:  ЧИСЛО арифметическая операция ЧИСЛО\n***Числа должны быть илибо только арабскими, либо только римскими***\n ");
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("Input:\n");
        input = sc.nextLine();

        MultiCalc calc=new MultiCalc(input);
        System.out.println("\nOutput:\n\n" + calc.exec()+ "\n");
        } while (Validation.getValidation(input));

    }

}