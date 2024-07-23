package NGlesson38.classwork;

import java.util.Random;

public class SecondMain {
    public static void main(String[] args) {

        Random random = new Random();
        boolean isNotOk = random.nextBoolean();

        // Исключения это тоже ОБЬЕКТЫ!

        if (isNotOk){
            throw new RuntimeException();
        }

    }
}
