import java.util.Scanner;

/**
 * Написать программу, которая будет выполнять следующие действия:
 * 1. Ввод трех чисел с клавиатуры X,Y,Z
 * 2. Нахождение и вывод на экран среднего арифметического чисел X,Y,Z
 * 3. Деление среднего арифметического на 2 без остатка
 * 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
public class Average {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.println("Введите второе число:");
        int second = scanner.nextInt();
        System.out.println("Введите третье число:");
        int third = scanner.nextInt();

        int averResult = (first + second + third) / 3;
        System.out.println(String.format("Среднее арифметическое чисел %d, %d, %d равно %d",
                first, second, third, averResult));

        int division = averResult / 2;
        if (division > 3) {
            System.out.println("Программа выполнена корректно");
        }
        scanner.close();
    }
}
