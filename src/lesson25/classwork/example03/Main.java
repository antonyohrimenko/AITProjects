package lesson25.classwork.example03;

public class Main {
    public static void main(String[] args) {

        String text = "Hello World";

        text.toUpperCase(); // иммутабельный, вызов его методов не изменяет обьект
       //  text = text.toUpperCase(); чтобы работало

        System.out.println(text.toUpperCase());
        System.out.println("*".repeat(text.length()));

        String test1 = "Hello World";
        String test2 = "Hello World";

        System.out.println(test1 == test2);
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());





    }
}
