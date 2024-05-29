package NGlesson24.classwork;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String pushkin = "У Лукоморья дуб зеленый, златая цепь на дубе том";

        String[] array = pushkin.split(" ");
        System.out.println(Arrays.toString(array));



    }
}
