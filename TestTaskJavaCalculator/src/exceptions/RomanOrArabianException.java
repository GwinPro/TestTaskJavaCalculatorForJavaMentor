package exceptions;

public class RomanOrArabianException extends Exception{

    public RomanOrArabianException() {
        super("\nВведите корректные числа арабскими или римскими цифрами!!!\n Программа будет закрыта!!!");
    }
}
