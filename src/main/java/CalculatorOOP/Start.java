package CalculatorOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            double inputFirstNumber = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double inputSecondNumber = scanner.nextDouble();
            System.out.println("Enter operation (+, -, *, /):");
            char operation = scanner.next().charAt(0);
            Calculator calculator = new Calculator(inputFirstNumber, operation, inputSecondNumber);
            System.out.println("Answer:");
            System.out.printf("%.4f", calculator.calculate().getResult());
            scanner.close();
        } catch (InputMismatchException ex) {
            System.out.println("You entered an incorrect number");
        } catch (ArithmeticException ex1) {
            System.out.println("Dividing by zero is prohibited");
        } catch (NullPointerException ex2) {
            System.out.println("You have entered an incorrect operation symbol");
        }
    }
}
