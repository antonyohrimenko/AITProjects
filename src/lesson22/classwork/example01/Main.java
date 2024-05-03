package lesson22.classwork.example01;

public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[10]; // Create an array for 10 Product objects

        // Initialize each element of the array
        products[0] = new Product(1, "Laptop", 999);
        products[1] = new Product(2, "Smartphone", 499.99);
        products[2] = new Product(3, "Tablet", 299.99);
        products[3] = new Product(4, "Monitor", 199.99);
        products[4] = new Product(5, "Keyboard", 49.99);
        products[5] = new Product(6, "Mouse", 29.99);
        products[6] = new Product(7, "Webcam", 89.99);
        products[7] = new Product(8, "Headphones", 59.99);
        products[8] = new Product(9, "External Hard Drive", 89.99);
        products[9] = new Product(10, "Printer", 129.99);


        Order order = new Order();
        order.addProduct(products[0], 4);
        order.addProduct(products[5], 4);
        order.addProduct(products[9], 1);
        order.addProduct(products[7], 4);

        System.out.println("Total: " + order.getTotal());


    }
}
