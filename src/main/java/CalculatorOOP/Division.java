package CalculatorOOP;

public class Division extends Action {

    public Division(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
    }

    @Override
    public double getResult() {
        return inputFirstNumber / inputSecondNumber;
    }
}
