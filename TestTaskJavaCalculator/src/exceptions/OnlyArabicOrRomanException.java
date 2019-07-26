package exceptions;

public class OnlyArabicOrRomanException extends Exception {

    public OnlyArabicOrRomanException() {
        super("\nВведите числа либо только римскими цифрами, либо только арабскими!!!\n Программа будет закрыта!!!");
    }
}
