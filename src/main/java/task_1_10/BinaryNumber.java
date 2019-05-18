package task_1_10;

import java.util.Scanner;

/**
 * Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран
 */
public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате, например 1010");
        System.out.println(String.format("Вы ввели число %d", Integer.parseInt(sc.nextLine(), 2)));
        sc.close();
    }
}
