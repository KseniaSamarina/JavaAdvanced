package CalculatorOOP;

public class Multiplication extends Action {

    public Multiplication(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
    }

    @Override
    public double getResult() {
        return inputFirstNumber * inputSecondNumber;
    }
}
