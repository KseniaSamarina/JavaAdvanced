import java.util.Scanner;
/**
 * @author Ksenia Samarina
 * @version 1.0
 */
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первое число");
        num1 = reader.nextDouble();
        System.out.println("Пожалуйста, введите второе число");
        num2 = reader.nextDouble();
        System.out.println("Введите арифметическую операцию (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+' -> ans = num1 + num2;
            case '-' -> ans = num1 - num2;
            case '*' -> ans = num1 * num2;
            case '/' -> ans = num1 / num2;
            default -> {
                System.out.print("Ошибка! Некорректная операция");
                return;
            }
        }
        System.out.print("\nВаш результат:\n");
        System.out.printf("%.4f", ans);
        reader.close();
    }
}
