package CalculatorOOP;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double inputFirstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double inputSecondNumber = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        Calculator calculator = new Calculator(inputFirstNumber, operation, inputSecondNumber);
        System.out.println("Answer:");
        System.out.printf("%.2f", calculator.calculate().getResult());
        scanner.close();
    }
}
