package lesson23.homework;

/*
В классе продавца создать массив из Продуктов с размером 10.
Заполнить этот массив значениями из головы в конструкторе продавца либо в Main.
Разработать методы:
1 "огласить цену" - принимает наименование продукта и его количество, и возвращает цену
этого продукта или -1 если такого продукта нет либо нет соответствующего количества на складе
Подсказка: линейный поиск
2 "продать продукт" - принимает наименование продукта и количество, отнимает данный
продукт со склада (из массива)
 */

public class Seller extends Person {
    private Product[] products;

    public Seller(String name, Product[] products) {
        super(name);
        this.products = products;
    }

    public double announcePrice(String productName, int amount) {
        Product product = findProduct(productName);
        if (product != null && product.getQuantity() >= amount) {
            return product.getPrice() * amount;
        }
        return -1;
    }

    public void sellProduct(String productName, int amount) {
        Product product = findProduct(productName);
        if (product != null && product.getQuantity() >= amount) {
            product.setQuantity(product.getQuantity() - amount);
        }
    }

    private Product findProduct(String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName)) {
                return products[i];
            }
        }
        return null;
    }
}
