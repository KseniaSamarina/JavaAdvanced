package CalculatorOOP;

public class Division extends Action {

    public Division(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
    }

    @Override
    public double getResult() throws ArithmeticException {
        if (inputSecondNumber == 0.0)
            throw new ArithmeticException("Dividing by zero is prohibited");
        else
            return inputFirstNumber / inputSecondNumber;
    }
}