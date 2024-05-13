package lesson25.classwork.example03;

public class Main02 {
    public static void main(String[] args) {

        String str = "";
        long start = System.nanoTime();

        for (int i =0; i < 1000; i++){
            str+="!";
        }
        long end = System.nanoTime();
        double time = (end - start) / 1_000_000.0;

        System.out.println(time);
    }
}
