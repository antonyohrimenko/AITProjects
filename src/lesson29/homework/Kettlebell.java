package lesson29.homework;

/*
Разработать класс "Гиря" с свойствами материал, цвет и вес.
Применить инкапсуляцию и переопределить методы equals, hashCode и toString.
Этот класс должен реализовывать интерфейс Comparable.
Метод compareTo должен обозначать, какая гиря тяжелее по весу.
В Main показать пример использования.
 */

import java.util.Objects;

public class Kettlebell implements Comparable<Kettlebell> {

    private double weight;
    private Materials material;
    private Colours colour;

    // конструктор
    public Kettlebell(double weight, Materials material, Colours colour) {
        this.weight = weight;
        this.material = material;
        this.colour = colour;
    }

    // сеттеров не будет
    public double getWeight() {
        return weight;
    }

    public Materials getMaterial() {
        return material;
    }

    public Colours getColour() {
        return colour;
    }

    // переопределяем toString, hashCode, Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kettlebell that = (Kettlebell) o;
        return Double.compare(weight, that.weight) == 0 && material == that.material && colour == that.colour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, material, colour);
    }

    @Override
    public String toString() {
        return "Class: Kettlebell {" +
                "weight = " + weight +
                ", material = " + material +
                ", colour = " + colour +
                '}';
    }

    // пишем метод сравнения
    @Override
    public int compareTo(Kettlebell o) {
        if (this.weight > o.weight) {
            return 1;
        } else if (this.weight < o.weight) {
            return -1;
        }
        return 0;
    }
}
