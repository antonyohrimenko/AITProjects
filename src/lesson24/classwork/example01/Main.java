package lesson24.classwork.example01;

public class Main {
    public static void main(String[] args) {

        // класс который представляет обьект в Java
        // от него наследуются все классый
        // Object object = new Object();

        Product product = new Product(123, "Tomato", 3.50);
        Product product1 = new Product(123, "Tomato", 3.50);

        System.out.println(product); // toString вызывается автоматически - переопределенный
        // если бы не переопределили - вызвался бы стандартный

        System.out.println(product.hashCode());

        System.out.println(product.equals(product1));

        System.out.println("Ref: " + product.equals(product));
        System.out.println("Type: " + product.equals("Tomato"));
        System.out.println("Value: " + product.equals(new Product(1, "Tomato", 1)));
    }
}
