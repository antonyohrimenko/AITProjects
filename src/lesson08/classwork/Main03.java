package lesson08.classwork;

public class Main03 {
    public static void main(String[] args) {

        // написать строку по букве

        String text = "I love JAVA";

        for (int i=0; i < text.length(); i++)
        {
            System.out.println(text.charAt(i));
        }
    }
}
