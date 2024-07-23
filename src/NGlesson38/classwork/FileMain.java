package NGlesson38.classwork;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileMain {

    public static void main(String[] args) {

        try {
            File file = new File("numbersHW38.txt");
            FileReader fileReader = new FileReader(file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Простите но такого файла нет");
        }
        finally {
            System.out.println("Тут отработал блок Finally то есть всегда");
        }

        System.out.println("Программа все равно работает дальше, а файла нет");
    }
}
