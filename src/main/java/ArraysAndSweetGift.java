import java.util.Scanner;
public class ArraysAndSweetGift {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("1 - Массив, 2 - Сладкий подарок");
        int num = console.nextInt();
        if (num == 1) {
            arrays();
        }
        if (num == 2) {
            sweetGift();
        }
        console.close();
    }
    public static void arrays() {
        int[] array = new int[20];
        int index = 0;
        int index1 = 0;
        int minPositive = 10;
        int maxNegative = -10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            if (array[i] < 0 && maxNegative < array[i]) {
                maxNegative = array[i];
            }
            if (array[i] > 0 && minPositive > array[i]) {
                minPositive = array[i];
            }
        }
        System.out.println("Минимальный положительный элемент массива = " + minPositive);
        System.out.println("Максимальный отрицательный элемент массива = " + maxNegative);
        System.out.println("\nВаш массив. Версия 1.0");
        for (int a : array) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minPositive) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNegative) {
                index1 = i;
                break;
            }
        }
        array[index] = maxNegative;
        array[index1] = minPositive;
        System.out.println("\nВаш массив. Версия 2.0");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
    public static void sweetGift() {
        Candy candy1 = new Candy("Коровка", 10.6, 0.5, "Клубничная");
        Candy candy2 = new Candy();
        candy2.setName("Ромашка");
        candy2.setPrice(17.8);
        candy2.setWeight(4.7);
        candy2.setTopping("Шоколадная");
        Jellybean jelly1 = new Jellybean("БонПари", 15.2, 1.0, "Голубой");
        Cookie coolie1 = new Cookie("Юбилейное", 18.9, 14.0, "Круг");
        Sweets[] box = {candy1, candy2, jelly1, coolie1};
        System.out.println("\nОбщий вес подарка:");
        System.out.println(candy1.getWeight() + candy2.getWeight() + jelly1.getWeight() + coolie1.getWeight());
        System.out.println("\nОбщая цена подарка:");
        System.out.println(candy1.getPrice() + candy2.getPrice() + jelly1.getPrice() + coolie1.getPrice());
        System.out.println("\nСладости в подарке:");
        for (Sweets someSweet : box) {
            System.out.println(someSweet.toString());
        }
    }
}
