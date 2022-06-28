package CalculatorOOP;

public class Calculator {
    private final char operation;
    private final double inputFirstNumber;
    private final double inputSecondNumber;

    public Calculator(double inputFirstNumber, char operation, double inputSecondNumber) {
        this.operation = operation;
        this.inputFirstNumber = inputFirstNumber;
        this.inputSecondNumber = inputSecondNumber;
    }

    public Action calculate() {
        return switch (operation) {
            case '+' -> new Addition(inputFirstNumber, inputSecondNumber);
            case '-' -> new Subtraction(inputFirstNumber, inputSecondNumber);
            case '*' -> new Multiplication(inputFirstNumber, inputSecondNumber);
            case '/' -> new Division(inputFirstNumber, inputSecondNumber);
            default -> null;
        };
    }
}
