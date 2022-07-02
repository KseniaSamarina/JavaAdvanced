package CalculatorOOP;

public class Division extends Action {

    public Division(double inputFirstNumber, double inputSecondNumber) {
        Action.inputFirstNumber = inputFirstNumber;
        Action.inputSecondNumber = inputSecondNumber;
    }

    @Override
    public double getResult()  throws ArithmeticException {
        double result = inputFirstNumber / inputSecondNumber;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Dividing by zero is prohibited");
        }
        else
            return inputFirstNumber / inputSecondNumber;
    }
}









