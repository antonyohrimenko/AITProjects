package lesson23.homework;

public class Main {

    public static void main(String[] args) {
        // Создаем продукты и заполняем значениями
        Product[] products = new Product[]{
                new Product("Молоко", 20, 1.5),
                new Product("Хлеб", 30, 0.8),
                new Product("Яйца", 50, 2.0)
        };

        // Создаем продавца
        Seller seller = new Seller("Мистер Бауман", products);
        seller.introduce();

        // Создаем покупателя
        Customer customer = new Customer("Йосик", 50);
        customer.introduce();
        System.out.println(customer.getMoney());

        System.out.println("\n ========================== \n");

        // Выводим весь спиосок товара у продавца
        System.out.println("Список доступных продуктов: ");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName() + ": " + product.getQuantity());
        }




        // Мистер Бауман, почем 2л молока?
        double price = seller.announcePrice("Молоко", 2);
        if (price != -1) {
            System.out.println("Цена за 2 литра молока: " + price + " евро");
        } else {
            System.out.println("Продукт отсутствует или недостаточно товара на складе.");
        }

        // Йосик покупает :)
        if (customer.startPurchase(seller, "Молоко", 2)) {
            System.out.println("Покупка прошла успешно!");
        } else {
            System.out.println("Недостаточно средств для покупки.");
        }

        System.out.println("Остаток денег: " + customer.getMoney());

        // Продавец продает продукт
        seller.sellProduct("Молоко", 2);

        System.out.println("\n ========================== \n");

        // Выводим оставшиеся продукты, чтобы показать остаток и что все работает
        System.out.println("Оставшиеся продукты:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName() + ": " + product.getQuantity());
        }
    }
}

