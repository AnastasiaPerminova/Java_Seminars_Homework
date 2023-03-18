//2. Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HomeWork2Task2 {

        public static void main(String[] args) throws IOException {
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));

            String text ="TEXT";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                sb.append(text);
                sb.append(' ');
            }
            byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();
        }
    }



