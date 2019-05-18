package task_1_10;

import java.util.Scanner;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную T.
 * В программе должны присутствовать константы X, Y, Z.
 * Программа должна сравнивать введенное значение с клавиатуры со значением констант
 * и вывести на экран сообщение "Данное значение имеется в константах" если T=X или Y или Z.
 * Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */
public class Comparison {
    private final static int X = 15;
    private final static int Y = 2;
    private final static int Z = 7;

    public static void main(String[] args) {
        System.out.println("Для сравнения с константами введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах.");
        } else {
            System.out.println("Такой константы нет!");
        }
        scanner.close();
    }
}
