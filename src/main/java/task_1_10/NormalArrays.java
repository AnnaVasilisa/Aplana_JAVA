package task_1_10;

import java.util.Scanner;

/**
 * Произведите ввод данных с клавиатуры в массив,
 * а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
 */
public class NormalArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i != arr.length; i++) {
            System.out.println("Введите любое число. Осталось ввести " + (arr.length - i));
            arr[i] = sc.nextInt();
        }

        System.out.println("Числа из массива, умноженные на 2.");
        for (int y = 0; y != arr.length; y++) {
            System.out.print(arr[y] * 2 + " ");
        }
        sc.close();
    }
}
