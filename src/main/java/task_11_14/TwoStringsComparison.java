package task_11_14;

import java.util.Scanner;

/**
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
 * Результат вывести на экран.
 * <p>
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов.
 * Результат в виде строки без пробелов вывести на экран.
 * <p>
 * Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры
 * и записаны в соответствующие переменные.
 * Вывести на экран строку с наибольшей длинной.
 */
public class TwoStringsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какую-нибудь строку:");
        String firstString = scanner.nextLine();
        System.out.println(String.format("Вы ввели:\n %s", firstString));

        System.out.println("Введите строку еще раз:");
        String secondString = scanner.nextLine();
        String replaceString = secondString.replaceAll("\\s+", "");
        System.out.println(String.format("Строка без пробелов:\n %s", replaceString));

        String a = firstString.length() > secondString.length() ? firstString : secondString;

        System.out.println(String.format("Самая длинная строка это:\n %s", a));
        scanner.close();
    }
}
