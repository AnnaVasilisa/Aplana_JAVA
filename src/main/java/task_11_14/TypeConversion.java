package task_11_14;

import java.util.Scanner;

/**
 * Необходимо написать программу, которая будет реализовывать следующие действия:
 * 1. Ввод числа с клавиатуры и запись его в строковую переменную S
 * <p>
 * 2. Конвертация строковой переменной S в числовую переменную X типа int
 * <p>
 * 3. Конвертация числа X типа int в число Y типа double
 * <p>
 * Все три числа разных типов необходимо в столбик вывести на экран
 */
public class TypeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        int secondInt = Integer.parseInt(firstString);
        double thirdDouble = Double.parseDouble(String.valueOf(secondInt));
        System.out.println(String.format("String: %s\nInteger: %d\nDouble: %f", firstString, secondInt, thirdDouble));
        scanner.close();
    }
}
