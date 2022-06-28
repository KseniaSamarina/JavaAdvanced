package CalculatorOOP;

public class Addition extends Action {

    public Addition(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
    }

    @Override
    public double getResult() {
        return inputFirstNumber + inputSecondNumber;
    }
}
