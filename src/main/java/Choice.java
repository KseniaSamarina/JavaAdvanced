import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("1 - Калькулятор, 2 - Массив из слов");
        int num = console.nextInt();
        if (num == 1) {
            calculator();
        }
        if (num == 2) {
            arrays();
        }
        console.close();
    }
    public static void calculator() {
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
    public static void arrays() {
        Scanner console = new Scanner(System.in);
        String[] array;
        String max = "";
        String t;
        System.out.println("Введите размер массива");
        int size = console.nextInt();
        console.nextLine();
        array = new String[size];
        int cursor = 0;
        do {
            System.out.println("Введите слово");
            String word = console.nextLine();
            array[cursor] = word;
            t = word;
            if (t.length() > max.length()) {
                max = word;
            }
            cursor++;
        } while (--size > 0);
        System.out.println(max);
        console.close();
    }
}
