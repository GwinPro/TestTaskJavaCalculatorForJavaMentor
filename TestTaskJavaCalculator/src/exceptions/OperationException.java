package exceptions;

public class OperationException extends Exception {
    public OperationException() {
        super(" \nВведите ПРАВИЛЬНО одну из четырех операций:\n сложение - \"+\";\n разность - \"-\";\n " +
                "умножение - \"*\";\n деление - \"/\";\n Программа будет закрыта!!!");
    }
}

