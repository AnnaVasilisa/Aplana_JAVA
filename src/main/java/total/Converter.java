package total;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите курс обмена:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stringCourse = br.readLine();
        double course = Double.parseDouble(stringCourse);

        System.out.println("Сколько хотите поменять рублей?");
        String changeString = br.readLine();
        double change = Double.parseDouble(changeString);
        System.out.println(String.format("При обмене %.2f рублей по курсу %.2f, вы получите %.2f рублей", change, course, change / course));


    }
}
