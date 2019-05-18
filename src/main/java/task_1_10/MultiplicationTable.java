package task_1_10;

import java.util.Scanner;

/**
 * Необходимо вывести на экран таблицу умножения для введённого пользователем числа. Использовать циклы запрещено.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int scNumber = sc.nextInt();
        System.out.println(String.format("Таблица умножения для числа %d", scNumber));
        System.out.println(String.format("%d * 1 = %d", scNumber, (scNumber)));
        System.out.println(String.format("%d * 2 = %d", scNumber, (scNumber * 2)));
        System.out.println(String.format("%d * 3 = %d", scNumber, (scNumber * 3)));
        System.out.println(String.format("%d * 4 = %d", scNumber, (scNumber * 4)));
        System.out.println(String.format("%d * 5 = %d", scNumber, (scNumber * 5)));
        System.out.println(String.format("%d * 6 = %d", scNumber, (scNumber * 6)));
        System.out.println(String.format("%d * 7 = %d", scNumber, (scNumber * 7)));
        System.out.println(String.format("%d * 8 = %d", scNumber, (scNumber * 8)));
        System.out.println(String.format("%d * 9 = %d", scNumber, (scNumber * 9)));
        System.out.println(String.format("%d * 10 = %d", scNumber, (scNumber * 10)));
        sc.close();
    }
}
