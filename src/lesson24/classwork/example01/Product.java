package lesson24.classwork.example01;

import java.util.Objects;

public class Product {

    private long id;
    private String name;
    private double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // переопределим метод toString
    @Override
    public String toString() {
        return "id: " + this.id +
                ", name: " + this.name +
                ", price: " + this.price;
    }

    // метод выдает число обьекта
    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    // метод equals равны ли 2 обьекта
    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (o instanceof Product){
            Product p = (Product) o;

            return p.name.equals(this.name) && p.id == this.id && p.price == this.price;
        }
        return false;
    }


}
