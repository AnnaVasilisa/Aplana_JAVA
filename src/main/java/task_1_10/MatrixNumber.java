package task_1_10;

import java.util.Scanner;

/**
 * Произведите ввод данных с клавиатуры в матрицу,
 * а после этого произведите вывод первой строки матрицы на экран,
 * где каждый элемент умножается на 3.
 */
public class MatrixNumber {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int a = 9;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i != arr.length; i++) {
            for (int j = 0; j != arr.length; j++) {
                System.out.println("Введите любое число. Осталось ввести " + a--);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Числа из массива, умноженные на 3.");
        for (int y = 0; y != arr.length; y++) {
            System.out.print(arr[0][y] * 3 + " ");
        }
        sc.close();
    }
}
