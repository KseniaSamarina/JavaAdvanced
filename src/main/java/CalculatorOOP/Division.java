package CalculatorOOP;

public class Division extends Action {

    public Division(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
        if (inputSecondNumber == 0) {
            throw new ArithmeticException("Double overflowed");
        }
    }

    @Override
    public double getResult() {
        return inputFirstNumber / inputSecondNumber;
    }
}
