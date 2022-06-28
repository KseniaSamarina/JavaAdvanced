package CalculatorOOP;

public class Subtraction extends Action {

    public Subtraction(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
    }

    @Override
    public double getResult() {
        return inputFirstNumber - inputSecondNumber;
    }
}
