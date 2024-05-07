package lesson23.homework;

/*
 В классе Продукт добавить поля наименование, количество и цена.
 */
public class Product {
    private String name; // наименование
    private int quantity; // количество
    private double price; // цена

    public Product() {
        this("", 0, 0);
    }

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);  // понял, выбираем максимальное или 0, чтобы
        // товар не стал отрицательным
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(price, 0);
    }


    // вообще можно убрать этот метод, убрать из "продукта"
    public boolean takeAmount(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }
}
