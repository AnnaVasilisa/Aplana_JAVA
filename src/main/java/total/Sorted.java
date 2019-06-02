package total;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * В начале узнаём у пользователя сколько он хочет отсортировать чисел.
 * Данное значение записываем в размер нашего массива.
 * После этого просим ввести нужные числа через запятую.
 * После этого записываем данные числа в массив строк, разделяя их по символу запятой
 * так как вводимые в консоль значения всегда приходят типа String.
 * Затем переводим данные из массива строк в массив чисел и сортируем по возрастанию.
 */
public class Sorted {
    public static void main(String[] args) throws IOException {
        System.out.println("Программа сортировки запущена!");
        System.out.println("Сколько чисел вы хотите отсортировать?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrLength = Integer.parseInt(br.readLine());
        int[] arr = new int[arrLength];
        System.out.println("Введите числа через запятую.");
        String userInput = br.readLine();
        int userInpLength = userInput.split(",").length;
        while (userInpLength < arrLength || userInpLength > arrLength || userInpLength == 0
                || userInput.equals(" ") || userInput.equals("")) {
            System.out.println(String.format("Вы ввели %d число(а), а нужно %d. Повторите ввод.", userInpLength, arrLength));
            userInput = br.readLine();
            userInpLength = userInput.split(",").length;
        }
        String[] stringArr = userInput.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        System.out.println("Сортируем числа по возрастанию...");
        for (int i = 0; i != arr.length; i++) {
            for (int j = i; j != arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(String.format("%d ", arr[i]));
        }
        br.close();
    }
}
