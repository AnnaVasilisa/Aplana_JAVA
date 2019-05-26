package task_15_18;

import java.io.*;

public class OutputAndWrite {
    public static void main(String[] args) {
        try {
            File file = new File("File.txt"); //Создаем новый файл.
            if (!file.exists()) { //Если файл с нужным именем не создан, то создадим его.
                file.createNewFile();
            }
            FileWriter fileReader = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
            bufferedWriter.write("Аня шла куда-то вдаль и крутила \"бабочку\". \n");
            bufferedWriter.flush();

            System.out.println("Сейчас в файле записано следующее:");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("А теперь Вы сами что-нибудь запишите в файл. " +
                    "Чтобы остановить запись введите слово \"стоп\" на новой строке.");
            br = new BufferedReader(new InputStreamReader(System.in));
            String userLine;
            while (!(userLine = br.readLine()).equals("стоп")) {
                bufferedWriter.write(userLine + "\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            br.close();
        } catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e); //Если что-то пойдет не по плану, то данный текст
            //с ошибкой выведется в консоль.
        }
    }
}
