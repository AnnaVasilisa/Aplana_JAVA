package task_15_18;

import java.io.*;

public class TaskWithStrings {
    public static void main(String[] args) {
        try {
            File file = new File("File.txt"); //Создаем новый файл.
            if (!file.exists()) { //Если файл с нужным именем не создан, то создадим его.
                file.createNewFile();
            }
            BufferedReader bufRead = new BufferedReader(new FileReader(file));
            if (bufRead.readLine() == null) { //Если файл пустой, то записываем в него нижеуказанный текст.
                FileWriter fileReader = new FileWriter(file); //Открываем файл для записи.
                BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
                bufferedWriter.write("Аня шла куда-то вдаль и кусала сушку. \n " +
                        "Сушка была жёсткой и кусалась тяжело\n " +
                        "Но дорога была долгой"); //Записываем данные.
                bufferedWriter.flush(); //Добавляем данные в файл.
            }
            System.out.println("Сейчас в файле записано следующее:");
            BufferedReader br = new BufferedReader(new FileReader(file)); //Выводим данные из файла.
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            //Считаем колличество строк в файле.
            InputStream is = new BufferedInputStream(new FileInputStream(file));
            byte[] c = new byte[1024];
            int count = 0;
            int readChars;
            boolean endsWithoutNewLine = false;
            while ((readChars = is.read(c)) != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n')
                        ++count;
                }
                endsWithoutNewLine = (c[readChars - 1] != '\n');
            }
            if (endsWithoutNewLine) {
                ++count;
            }
            System.out.println(String.format("Колличество строк в файле: %d.", count));
            is.close();

            //Перезаписываем текст в файле не превышая колличество строк.
            FileWriter fr = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fr);
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            String writeString;
            int stringCount = 0;
            while ((!(writeString = b.readLine()).equals("\n") && stringCount < count)) {
                bw.write(writeString + "\n");
                stringCount++;
                if (stringCount >= count) {
                    System.out.println(String.format("Нельзя написать больше чем %d строк. Нажмите клавишу Enter.", count));
                }
            }

            //Закрываем все потоки.
            bw.flush();
            b.close();
            bw.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e); //Если что-то пойдет не по плану, то данный текст
            //с ошибкой выведется в консоль.
        }
    }
}
